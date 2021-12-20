var str = '({"fname" : "kunchala", "lname" : "mallikarjun"})';
var obj = eval(str);
obj.lname = "viratKohi";
alert(obj.fname + " , " + obj.lname);