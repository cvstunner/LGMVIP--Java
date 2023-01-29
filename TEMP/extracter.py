import PyPDF2
import csv
import os


class extracter:
    def __init__(self):
        # files = ["Programming","College","Search-Tech","Sport","Shopping","Server","Politics","News","Music","Gaming","Football","Financial","Esport","Entertainment","Cricket","Concert",]

        # print(os.listdir("./links"))
        for file in os.listdir("./links"):
            print(file)
            reader = rwFile("./links/" + file)

    def rwFile(path):
        file = open(path, "rb")
        reader = PyPDF2.PdfReader(file)
        return reader

    def rwURL(path, reader):
        f = open(path, "w", encoding="UTF8", newline="")
        for page in reader.pages:
            if "/Annots" in page:
                writer = csv.writer(f)
                for annot in page["/Annots"]:
                    subtype = annot.get_object()["/Subtype"]
                    if subtype == "/Link":
                        # print("http://" + (annot.get_object()["/A"]["/URI"]).split('/')[4]);
                        writer.writerow(
                            [
                                "http://"
                                + (annot.get_object()["/A"]["/URI"]).split("/")[4]
                            ]
                        )

    # rwURL("./links/links.csv")
    # file.close()


# obj = extracter
if __name__ == "__main__":
    extracter()
