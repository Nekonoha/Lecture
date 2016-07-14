function change2gu() {
	var obj = document.all && document.all("body") || document.getElementById && document.getElementById("body");
	if (obj) {
		obj.style.color = "red";
		obj.style.backgroundColor = "#ff7f7f";
		obj.style.backgroundImage = 'url("./red.gif")';
	}
}

function change2choki() {
	var obj = document.all && document.all("body") || document.getElementById && document.getElementById("body");
	if (obj) {
		obj.style.color = "green";
		obj.style.backgroundColor = "#7fff7f";
		obj.style.backgroundImage = 'url("./green.gif")';
	}
}


function change2pa() {
	var obj = document.all && document.all("body") || document.getElementById && document.getElementById("body");
	if (obj) {
		obj.style.color = "blue";
		obj.style.backgroundColor = "#7f7fff";
		obj.style.backgroundImage = 'url("./blue.gif")';
	}
}
