function click(){
    //Añadimos un addEventListener al canvas para reconocer el click
    layer4.addEventListener("click",
    //Una vez se haya clickado se activará la siguiente función
    getPosition //la cual optendra la posicion
    ,false);
    layer4.addEventListener("mousemove",Marcar,false);
}
//canvas.addEventListener("mousedown", getPosition, false);
//funcion para saber la posicion del mause y saber que seccion estamos clickeando
function getPosition(event){
    var x = event.x;
    var y = event.y;
    //alert(y);
    //alert(x);
    var canvas = document.getElementById("myCanvas");
    var div_can = document.getElementById("canvasesdiv");
    x -= div_can.offsetLeft;//posicionx del canvas
    y -= div_can.offsetTop;//posicion y del canvas
    //alert(div_can.offsetTop);
    var div=0;
    var color='';
    var accion='';
    //en esta parte se valida que tipo de accion se realizara en el diente 
    seleccion = $("input[name='accion']:checked").val();
    if (seleccion == 'fractura'){
        color = 'red';
        accion = 'seccion';
    }
    else if(seleccion=='restauracion'){
        color = 'blue';
        accion = 'seccion';
    }
    else if(seleccion=='extraccion'){
        color = 'red';
        accion = 'marcar';
    }
    else if(seleccion=='puente'){
        accion = 'puente';
    }
    else if(seleccion=='borrar'){
        accion = 'borrar';
    }
   else if (seleccion == 'bien'){
        color = 'green';
        accion = 'seccion';
    }
    else if (seleccion == 'caries'){
        color = 'pink';
        accion = 'seccion';
    }else if (seleccion == 'erup'){
        color = 'purple';
        accion = 'seccion';
    }
    //alert(y);
    diente = 0;
    seccion = 0;
    if (y>=20 && y<=60){
        //alert(x);
        if (x>=10 && x<=50){
            diente = 1;
        }
        else if (x>=60 && x<=800){
            div =  parseInt(x/50,10);
            ini = (div*40) + (10*div) + 10;
            fin = ini + 40;
            if (x>=ini && x<=fin){
                diente=div+1;
            }
        }
    }
    else if(y>=140 && y<=180){
        if (x>=10 && x<=50){
            diente = 17;
        }
        else if (x>=60 && x<=800){
            div =  parseInt(x/50,10);
            ini = (div*40) + (10*div) + 10;
            fin = ini + 40;
            if (x>=ini && x<=fin){
                diente=div+17;
            }
        }
    }
    if (diente){
        //alert(diente);
        if(accion == 'seccion'){
            x = x-((div*40) + (10*div) + 10);
            y = y-20;
            if (diente>16){
                y = y-120;
            }
            //alert(y);
            if (y>0 && y<10 && x>y && y<40-x){
                seccion = 1;
            }else if (x>30 && x<40 && y<x && 40-x<y){
                seccion = 2;
            }else if (y>30 && y<40 && x<y && x>40-y){
                seccion = 3;
            }else if (x>0 && x<10 && y>x && x<40-y){
                seccion = 4;
            }else if (x>10 && x<30 && y>10 && y<30){
                seccion = 5;
            }
        }else if(accion == 'marcar'){
            cod=diente+'-0-'+'3';
            if(cod && !localStorage.getItem(cod)){
                new_array=[diente, 0, 3, Date.now(), 0];
                guardar = new_array.toLocaleString();
                localStorage.setItem(cod, guardar);
                marcar_extraccion(ctx2, diente, 'red')
            }else{
                alert("Ya fue marcado");
            }
        }else if(accion == 'puente'){
            if (diente1==0){
                marcar_diente(ctx4, diente, 'blue');
                diente1=diente;
            }else if(diente2==0){
                diente2=diente;
                menor=0;
                mayor=0;
                if(diente1>diente2){
                    mayor=diente1;
                    menor=diente2;
                }else{
                    mayor=diente2;
                    menor=diente1
                }
                diente1=menor;
                diente2=mayor;
                if ((diente1<17 && diente2<17 && diente1!=diente2) || (diente1>17 && diente2>17 && diente1!=diente2)){
                    marcar_diente(ctx4, diente, 'blue');
                    ctx4.clearRect(0, 0, 810, 70);
                    ctx4.clearRect(0, 135, 810, 70);
                    cod=diente1+'-0-4-'+diente2;
                    if(cod && !localStorage.getItem(cod)){
                        new_array=[diente1, 0, 4, Date.now(), diente2];
                        guardar = new_array.toLocaleString();
                        localStorage.setItem(cod, guardar);
                    }else{
                        alert("Ya fue marcado");
                    }
                    marcar_puente(ctx4, diente1, diente2, 'blue');
                }else{
                    ctx4.clearRect(0, 0, 810, 70);
                    ctx4.clearRect(0, 135, 810, 70);
                }
                
                diente1=0;
                diente2=0;
            }
        }else if(accion == 'borrar'){
            borrar_diente(ctx2, diente);
            //cargar el ultimo pintado
            seccion_chk = $("input[name='seccion']:checked").val();
            if (seccion_chk=='seccion'){
                x = x-((div*40) + (10*div) + 10);
                y = y-20;
                if (diente>16){
                    y = y-120;
                }
                seccion_b=ubica_seccion(x,y);
                if (seccion_b){
                    ultimo = '';
                    key_cod='';
                    for(var i=0; i < localStorage.length; i++){
                        var key_name = localStorage.key(i);
                        item = localStorage.getItem(key_name);
                        item = item.split(',');
                        diente_comp = parseInt(item[0],10);
                        seccion_comp = parseInt(item[1],10);
                        accion_comp = parseInt(item[2],10);
                        if(diente_comp==diente && seccion_b==seccion_comp && (accion_comp==1 || accion_comp==2)){
                            if(ultimo==''){
                                ultimo=item;
                                key_cod=key_name;
                            }
                            else{
                                fecha_ult = parseInt(item[3],10);
                                if(ultimo[3]<fecha_ult){
                                    ultimo=item;
                                    key_cod=key_name;
                                }
                            }
                        }
                    }
                    if(key_cod!=''){
                        //console.log(key_cod);
                        localStorage.removeItem(key_cod);
                    }
                }

            }else if(seccion_chk=='diente'){
                ultimo = '';
                key_cod='';
                for(var i=0; i < localStorage.length; i++){
                    var key_name = localStorage.key(i);
                    item = localStorage.getItem(key_name);
                    item = item.split(',');
                    diente_comp = parseInt(item[0],10);
                    accion_comp = parseInt(item[2],10);
                    if(diente_comp==diente && accion_comp==3 ){
                        if(ultimo==''){
                            ultimo=item;
                            key_cod=key_name;
                        }
                        else{
                            fecha_ult = parseInt(item[3],10);
                            if(ultimo[3]<fecha_ult){
                                ultimo=item;
                                key_cod=key_name;
                            }
                        }
                    }
                }
                if(key_cod!=''){
                    //console.log(key_cod);
                    localStorage.removeItem(key_cod);
                }
            }
            //alert('a');
            pinta_datos();
        }
    }
    //alert(diente);
    if (seccion && color!=''){
        //alert(color);
        
        //alert(seccion);
        //[numero_diente, seccion, accion, fecha, diente2]
        //aqui se ocupan las secciones o los radios por ejemplo el radio 1 es de fractura entonces tenemos disponibles despues del 6 
        if (color=='red'){
            cod=diente+'-'+seccion+'-'+'1';
            accion_g = 1;
            
        }else if (color=='blue'){
            cod=diente+'-'+seccion+'-'+'2';
            accion_g = 2;
        }else if (color=='green'){
            cod=diente+'-'+seccion+'-'+'4';
            accion_g = 4;
        }
        else if (color=='pink'){
            cod=diente+'-'+seccion+'-'+'5';
            accion_g = 1;
        }
        ;
        if(cod && !localStorage.getItem(cod)){
            new_array=[diente, seccion, accion_g, Date.now(), 0];
            guardar = new_array.toLocaleString();
            localStorage.setItem(cod, guardar);
            dibuja_seccion(ctx2, diente, seccion, color);
        }
        else{
            alert("ya fue marcado");
        }
        
    }
    if ( 'borrar' == $("input[name='accion']:checked").val()){
        //alert("x-> "+x+" y-> "+y);
        //ctx4.clearRect(0, 0, 810, 300);
        
        if (x>=30 && x<=780 && ((y>78 && y<82) || (y>198 && y<202))){
            //alert(x);
            div =  parseInt(x/50,10);
            //alert(div);
            ultimo = '';
            key_cod='';
            for(var i=0; i < localStorage.length; i++){
                var key_name = localStorage.key(i);
                item = localStorage.getItem(key_name);
                item = item.split(',');
                diente1_comp = parseInt(item[0],10);
                diente2_comp = parseInt(item[4],10);
                accion_comp = parseInt(item[2],10);
                if(accion_comp==4){
                    if (diente1_comp>16){
                        diente1_comp = diente1_comp - 17;
                        diente2_comp = diente2_comp - 17;
                    }else{
                        diente1_comp = diente1_comp - 1;
                        diente2_comp = diente2_comp - 1;
                    }
                    inicio_x = (diente1_comp*40) + (10*diente1_comp) + 10 + 20;
                    fin_X = (diente2_comp*40) + (10*diente2_comp) + 10 + 20;
                    if (x>=inicio_x && x<=fin_x){
                        if(ultimo==''){
                            ultimo=item;
                            key_cod=key_name;
                        }
                        else{
                            fecha_ult = parseInt(item[3],10);
                            if(ultimo[3]<fecha_ult){
                                ultimo=item;
                                key_cod=key_name;
                            }
                        }
                    }
                    
                }
            }
            if(key_cod!=''){
                console.log(key_cod);
                if(parseInt(ultimo[0],10)<16){
                    seccion_p=1;
                    ctx4.clearRect(0, 130, 810, 130);
                }
                else{
                    ctx4.clearRect(0, 130, 810, 150);
                    seccion_p=2;
                }
                localStorage.removeItem(key_cod);
                pinta_puentes(seccion_p);
            }
        }
        
    }
    
}

    //dibuja_seccion(x, y, 5, 5);
    //dibuja_seccion(context, num_diente, seccion, color)


function Marcar(event){
    var x = event.x;
    var y = event.y;
    var canvas2 = document.getElementById("myCanvas2");
    var div_can = document.getElementById("canvasesdiv");
    x -= div_can.offsetLeft;
    y -= div_can.offsetTop;
    //alert(x);
    diente=0;
    seccion=0;
    var div=0;
    
    if (y>=20 && y<=60){
        //alert(x);
        if (x>=10 && x<=50){
            diente = 1;
            //alert("1");
        }
        else if (x>=60 && x<=800){
            div =  parseInt(x/50,10);
            ini = (div*40) + (10*div) + 10;
            fin = ini + 40;
            if (x>=ini && x<=fin){
                diente=div+1;
            }
        }
    }
    else if(y>=140 && y<=180){
        if (x>=10 && x<=50){
            diente = 17;
        }
        else if (x>=60 && x<=800){
            div =  parseInt(x/50,10);
            ini = (div*40) + (10*div) + 10;
            fin = ini + 40;
            if (x>=ini && x<=fin){
                diente=div+17;
            }
        }
    }
    //alert(diente);
    if (diente) {
        accion = $("input[name='accion']:checked").val();
        var seleccion = '';
        if (accion == 'fractura'){
            seleccion = 'seccion';
        }
        else if(accion=='restauracion'){
            seleccion = 'seccion';
        }else if(accion=='bien'){
            seleccion = 'seccion';
        }else if(accion=='caries'){
            seleccion = 'seccion';
        }else if(accion=='erup'){
            seleccion = 'seccion';
        }
        else if(accion=='extraccion'){
            seleccion = 'diente';
        }
        else if(accion=='puente'){
            seleccion = 'diente';
        }
        else if(accion=='borrar'){
            seccion_chk = $("input[name='seccion']:checked").val();
            if (seccion_chk=='diente'){
                seleccion = 'diente';
            }
            else{
                seleccion = 'seccion';
            }
        }
        if (seleccion=='seccion'){
            x = x-((div*40) + (10*div) + 10);
            y = y-20;
            if (diente>16){
                y = y-120;
            }
            //alert(y);
            /*if (y>=x && y<=39){}*/
            // Ubicar la seccion clickeada
            if (y>0 && y<10 && x>y && y<40-x){
                seccion = 1;
            }else if (x>30 && x<40 && y<x && 40-x<y){
                seccion = 2;
            }else if (y>30 && y<40 && x<y && x>40-y){
                seccion = 3;
            }else if (x>0 && x<10 && y>x && x<40-y){
                seccion = 4;
            }else if (x>10 && x<30 && y>10 && y<30){
                seccion = 5;
            }
            //Comprobacion de si esta en una seccion
            if (seccion){
                //alert(seccion);
                color = 'yellow';
                ctx3.clearRect(0, 0, 810, 300);
                marcar_seccion(ctx3, diente, seccion, color);
                //alert(seccion);
            }else{
                //ctx2.fillStyle = "white";
                //ctx2.fillRect(0, 0, 810, 300);
                ctx3.clearRect(0, 0, 810, 300);
            }
        }
        else if(seleccion=='diente'){
            ctx3.clearRect(0, 0, 810, 300);
            marcar_diente(ctx3, diente, 'yellow');
        }
    }else{
        ctx3.clearRect(0, 0, 810, 300);
    }
    
    //dibuja_contorno(canvas, inicio_x, inicio_y, med, separacion_x, separacion_y)
}
function pinta_datos(){
    array_local = [];
    for(var i=0; i < localStorage.length; i++){
        var key_name = localStorage.key(i);
        array_local[i]=localStorage.getItem(key_name).split(',');
    }
    //console.log(array_local);
    array_local.sort(function(a,b){
        return a[3] > b[3]; // orden ascendente por las fechas;
    });
    //console.log(array_local);
    for(var i=0; i < array_local.length; i++){
        item = array_local[i];
        if(parseInt(item[0],10)==diente){
            acc = parseInt(item[2],10);
            
            //console.log(acc);
            if (acc==1){
                color='red';
                dibuja_seccion(ctx2, item[0], item[1], color);
            }else if (acc==2){
                color='blue';
                dibuja_seccion(ctx2, item[0], item[1], color);
                
            }else if (acc==3){
                marcar_extraccion(ctx2, item[0], 'red');
            }
        }
    }
}
function pinta_puentes(seccion_p){
    array_local = [];
    for(var i=0; i < localStorage.length; i++){
        var key_name = localStorage.key(i);
        array_local[i]=localStorage.getItem(key_name).split(',');
    }
    //console.log(array_local);
    array_local.sort(function(a,b){
        return a[3] > b[3]; // orden ascendente por las fechas;
    });
    //console.log(array_local);
    for(var i=0; i < array_local.length; i++){
        item = array_local[i];
        acc = parseInt(item[2],10);
        //console.log(acc);
        if (acc==4){
            color_pas = 'red';
            if (seccion_p==1){
                if(parseInt(item[0],10)<17){
                    marcar_puente(ctx4, item[0], item[4], color_pas);
                }
            }
            else{
                if(parseInt(item[0],10)>16){
                    marcar_puente(ctx4, item[0], item[4], color_pas);
                }
            }
            //dibuja_seccion(ctx2, item[0], item[1], color);
        }
        
    }
}
function ubica_seccion(X,Y){
    y=Y;
    x=X;
    devolver_seccion=0;
    if (y>0 && y<10 && x>y && y<40-x){
        devolver_seccion = 1;
    }else if (x>30 && x<40 && y<x && 40-x<y){
        devolver_seccion = 2;
    }else if (y>30 && y<40 && x<y && x>40-y){
        devolver_seccion = 3;
    }else if (x>0 && x<10 && y>x && x<40-y){
        devolver_seccion = 4;
    }else if (x>10 && x<30 && y>10 && y<30){
        devolver_seccion = 5;
    }
    return devolver_seccion;
}  