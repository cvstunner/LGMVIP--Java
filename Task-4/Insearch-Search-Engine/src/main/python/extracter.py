import PyPDF2
import csv
import os


class extracter:
    def __init__(self):
        self.file = None
        readPath = "../resources/pdfs/"
        writePath = "../resources/links/links.csv"
        self.genCSV(readPath, writePath, "w")

    def genCSV(self, readPath, writePath, mode):
        csv_file = open(writePath, mode, encoding="UTF8", newline="")
        for file in os.listdir(readPath):
            print(file)
            reader = self.rwFile(readPath + file)
            self.rwURL(csv_file, reader)
            self.file.close()
        csv_file.close()

    def rwFile(self, path):
        self.file = open(path, "rb")
        reader = PyPDF2.PdfReader(self.file)
        return reader

    def rwURL(self, file, reader):
        for page in reader.pages:
            if "/Annots" in page:
                writer = csv.writer(file)
                for annot in page["/Annots"]:
                    subtype = annot.get_object()["/Subtype"]
                    if subtype == "/Link":
                        writer.writerow(
                            [
                                "http://"
                                + (annot.get_object()["/A"]["/URI"]).split("/")[4]
                            ]
                        )


if __name__ == "__main__":
    extracter()
