function printSquare() {
    var str = '';
    var n =document.getElementById("n").value;
  
    for (var i = 0; i < n; i ++) {
      for (var j = 0; j < n; j++) {
        // In ra n dấu *
        str += ' * ';
      }
  
      // In ra dấu xuống dòng
      str += '<br>';
    }
    document.getElementById("hinh-ve").innerHTML = str;
  }
  

function printRectangle () {
    str= ""; 
    var w = document.getElementById("w-rect").value;
    var h = document.getElementById("h-rect").value;
    for ( i=0 ; i < h ; i++) {
        str += "*";
		if ( i == 0 || i == (h-1) ) { 
            for ( j = 1 ; j <= (w-1) ; j++) {
                str += "*"; }
		} else { 
            for ( j = 1; j <= (w-2)  ; j++) { 
                str += "&nbsp&nbsp"; 
            } 
            str= str + "*";
        }
		str += '<br/>';  
		}
    document.getElementById("hinh-ve").innerHTML = str;
}


function printTriangle() {
    var str= "";
    var height = document.getElementById("height").value;
	for ( var j=1 ; j <= height; j++) {
        for (var i=0 ; i< j ; i++) { 
            str = str + "*";
        }
    str += '<br>';
	}
    document.getElementById("hinh-ve").innerHTML = str;
}


function printSpecialTRiangle() {
    var height = document.getElementById("height2").value;
    var longest = (1 + 2 * height) ;
    str= "";
    for ( var z=0 ; z < longest ; z++) { str = str + "*"};  
    str = str +'<br>';
    for ( var i=0 ; i < height ; i++) {
            for ( var j = 0; j < longest ; j++) { 
                if ( ( j > i) && ( j < (longest - i)) ) {
                    str += "*";
                } else {
                    str += "&nbsp" ;
                }
                //  if  ( j <  i) { 
                //     str = str + "-" ;
                //     } else if ( j > (longest - i) ) {
                //         str= str + "-";
                //     } else {
                //         str = str +"*";
                //     }
                }
                str += '<br />';
            } 
        document.getElementById("hinh-ve").innerHTML = str;
    }
            
    
function printX() {
        var height = document.getElementById("X-height").value;
        str = " ";
        for ( var i = 0 ; i <= (height-1) ; i++) {
                for ( var j = 0 ; j <= (height-1) ; j++) {
                    if ( (j == i) || ( j == ( height - 1  - i) ) ) { 
                        str = str + '*'; 
                    } else { 
                        str = str + '&nbsp&nbsp' ;
                        }				
                    }
            str += '<br/>';
            }
        document.getElementById("hinh-ve").innerHTML = str;
    }
    

function printButerfly () {
    str = "";
    var h = document.getElementById("B-height").value;
    for ( var i = 0 ; i< (h+1)/2 ; i++) {	
        for (var j = 0 ; j < h ; j++) {
            if ( (i >= j) || (j >= (h-i)) ) {
                str += "*";
            } else { str += "&nbsp"; }
        }
        str += '<br/>';
        }

    for ( var i = (h+1)/2 ; i < h ; i++) {
        for (var j = 0 ; j < h ; j++) { 
            if ( (i <= j) || ( j <= (h-i)) ) {
                    str += "*";
            } else { str += "&nbsp"; }
        str += '<br/>';
        }  
    }
    document.getElementById("hinh-ve").innerHTML = str;
    alert('str');
}

    // for ( var i = 0 ; i< h ; i++) {
    //         if (i < (( h +1)/2) ) { 
    //              for ( var j= 0 ; j < h ; j++) { 
    //                 if ( ( j <= i) || (j >= (h - i) ) ) { 
    //                      str += "*";
    //                     } else { str += "&nbsp"; } 
    //                 }
    //         } else { 
    //               for ( var j= 0 ; j< h ; j++) {
    //                   if ( j <= (h - i) || ( j>= i ) ) { 
    //                       str += "*";
    //                     } else { 
    //                         str += "&nbsp";
    //                     } 
    //                 }
    //             }	
    //         str += '<br/>';
    //         }
    //     document.getElementById("hinh-ve").innerHTML = str;
    //     alert('str');
    // }
