<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Insearch</title>
	<link rel="stylesheet" type="text/css" href="../css/results.css?version=1">    
</head>
<body>
	<header>
		<nav>
            <form id="search-form" action="../search" method="get" onsubmit="search_form_submitted()">
                <a href="../" id="logo-wrpr">
                    <p>Insearch</p>
                </a>
                <div id="srch-input-wrpr">
                    <div id="srch-input-sub-wrpr">
                        <input id="srch-input" type="text" name="q" placeholder="Inserach of ..." autocomplete="off">
                        <div id="srch-hist-wrpr">
                        </div>
                    </div>
                </div>
            </form>
            <div>
                <div id="settings-icon-wrpr"  onclick="settings_icon_clicked()" name="hidden">
                    <div class="settings-icon"></div>
                </div>
                <span id="acc-icon-wrpr" onclick="acc_icon_clicked()" name="hidden">
                    <div id="acc-icon"></div>
                </span>
            </div>
		</nav>
	</header>
    <div id="sidebar-bg" onclick="sidebar_close_icon_clicked()"></div>
    <section class="sidebar" id="settings-sidebar">
        <nav>
            <div>
                <div>
                    <div>
                        <div class="settings-icon settings-sidebar-icon" class="settings-sidebar-icon"></div>
                        <p>Settings</p>
                    </div>
                    <span>
                        <p onclick="settings_icon_clicked()">X</p>
                    </span>
                </div>
                <hr>
                <div class="settings-sidebar-items">
                    <div>   
                        <p>History</p>
                        <label class="toggle-btn" for="history-toggle">
                            <input id="history-toggle" type="checkbox" checked>
                            <span class="toggle-btn-fg"></span>
                        </label>
                    </div>
                    <div>
                        <p>Delete Searches</p>
                        <button>delete</button>
                    </div>
                </div>
                <hr>
            </div>
        </nav>
    </section>
    <section class="sidebar" id="acc-sidebar">
        <nav>
            <div>
                <div>
                    <div>
                        <div class="settings-icon settings-sidebar-icon" class="settings-sidebar-icon"></div>
                        <p>Accounts</p>
                    </div>
                    <span>
                        <p onclick="acc_icon_clicked()">X</p>
                    </span>
                </div>
                <hr>
                <div class="settings-sidebar-items acc-sidebar-items">
                    <div>   
                        <p>chetanshigwan789@gmail.com</p>
                    </div>
                    <div>
                        <button>log out</button>
                    </div>
                </div>
                <hr>
            </div>
        </nav>
    </section>
	<main>
		<div id="srch-results-wrpr">
		</div>
	</main>
	<script type="text/javascript" src="../js/results.js"></script>
</body>
</html>