<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Odontograma con html5</title>
    <script src='js/jquery-1.7.2.min.js'></script>
    <link type="text/css" href="css/custom-theme/jquery-ui-1.8.13.custom.css" rel="stylesheet" />
    <script type="text/javascript" src="js/jquery-ui-1.8.13.custom.min.js"></script>
    <script type="text/javascript" src="js/Dibujo.js"></script>
    <script type="text/javascript" src="js/Acciones.js"></script>
    <style>
      #myCanvas {
        border: 1px solid #9C9898;
      }
      #myCanvas2 {
        border: 1px solid #9C9898;
      }
      #myCanvas3 {
        border: 1px solid #9C9898;
      }
      #myCanvas4 {
        border: 1px solid #9C9898;
      }
      body{
        text-align: center;
      }
    </style>
    <style  type="text/css">
        body, a, a:hover {cursor:  url(cur438.cur),  progress;}
    </style>
    <script>
    $(function() {
        $( "#radio" ).buttonset();
        $( "#radio_seccion" ).buttonset();
        $('#radio').change(function () {
            accion = $("input[name='accion']:checked").val();
            if(accion=='borrar'){
                $("#radio_seccion").show( 'blind', 500 );
            }else{
                $("#radio_seccion").hide( );
            }
        });
    });
    </script>
</head>
<body>

    <h1>Odontograma </h1>
    <br><br><br>
    <div id="radio">
        <input type="radio" id="radio6" name="accion" value="bien" checked="checked"  /><label for="radio6">Bien</label>
        <input type="radio" id="radio1" name="accion" value="fractura"  /><label for="radio1">Fractura</label>
        <input type="radio" id="radio8" name="accion" value="erup"  /><label for="radio8">Parcialmente Erupcionado</label>
        <input type="radio" id="radio9" name="accion" value="corona"  /><label for="radio9">corona</label>
        <input type="radio" id="radio2" name="accion" value="restauracion" /><label for="radio2">Resina</label>
        <input type="radio" id="radio7" name="accion" value="caries"  /><label for="radio7">Caries</label>
        <input type="radio" id="radio5" name="accion" value="puente" /><label for="radio5">Puente</label>
        <input type="radio" id="radio4" name="accion" value="extraccion" /><label for="radio4">Extraccion</label>
        <input type="radio" id="radio3" name="accion" value="borrar" /><label for="radio3">Borrar</label>
      
        
    </div>
    <br>
    <div id="canvasesdiv" style="position:relative; width:1010px; height:500px">
        <canvas id="myCanvas" width="1010" height="500" style="z-index: 1; position:absolute; left:400px; top:0px;"></canvas>
        <canvas id="myCanvas2" width="1010" height="500" style="z-index: 2; position:absolute; left:400px; top:0px;"></canvas>
        <canvas id="myCanvas3" width="1010" height="500" style="z-index: 3; position:absolute; left:400px; top:0px;"></canvas>
        <canvas id="myCanvas4" width="1010" height="500" style="z-index: 4; position:absolute; left:400px; top:0px;"></canvas>
    </div>
    
    <br/>
    <div id="radio_seccion" style='display:none'>
        <input type="radio" id="radio_1" name="seccion" value="seccion" checked="checked" /><label for="radio_1">Seccion</label>
        <input type="radio" id="radio_2" name="seccion" value="diente" /><label for="radio_2">Diente</label>
    </div>
    
    <script>
     
        // Valores iniciales
        var canvas = document.getElementById('myCanvas');
        var context = canvas.getContext('2d');
        //
        var layer2 = document.getElementById("myCanvas2");
        var ctx2 = layer2.getContext("2d");
        //
        var layer3 = document.getElementById("myCanvas3");
        var ctx3 = layer3.getContext("2d");
        //
        var layer4 = document.getElementById("myCanvas4");
        var ctx4 = layer4.getContext("2d");
        //
        var color_line = 'black';
        var medida = 40;//medida del tamaño de los dientes
        var separacion_x = 10;//seoaracion derecha
        var separacion_y = 10;//separacion izquieda
        var iniciar_x = 0;//inicio diente 
        var iniciar_y = 20;//inicion diente 2
        //Dientes para el puente
        var diente1=0;
        var diente2=0;
       
        //se dibujan los diente separados en dos grupos de 8
        //primer for para la parte superior
        for (x=0; x<8; x++){
            iniciar_x =  (x*medida) + (separacion_x*x) + separacion_x;
            dibuja_contorno(context, iniciar_x, iniciar_y, medida, separacion_x, 10);
            /* Numero de diente */
            context.font = '10pt Calibri';
            context.textAlign = 'center';
            context.fillStyle = 'black';
            context.fillText('1'+(x+1), iniciar_x+(medida/2), (iniciar_y/2)+5);
        }
       
        //segundo for para la parte inferior
        iniciar_x = 0;
        iniciar_y = medida + 100;//se toman lo agregado de los otros dientes
        for (x=0; x<8; x++){//se dibujan otros 16 dientes
            iniciar_x =  (x*medida) + (separacion_x*x) + separacion_x;
            
            dibuja_contorno(context, iniciar_x, iniciar_y, medida, separacion_x, 10);
            /* Numero de diente */
            context.font = '10pt Calibri';
            context.textAlign = 'center';
            context.fillStyle = 'black';
            context.fillText('4'+(x+1), iniciar_x+(medida/2), (iniciar_y-10)+5);
        }
        iniciar_x = 0;
        iniciar_y = 20;
        for (x=0; x<8; x++){
            iniciar_x =  ((x*medida) + (separacion_x*x) + separacion_x)+600;
            dibuja_contorno(context, iniciar_x, iniciar_y, medida, separacion_x, 10);
            /* Numero de diente */
            context.font = '10pt Calibri';
            context.textAlign = 'center';
            context.fillStyle = 'black';
            context.fillText('2'+(x+1), iniciar_x+(medida/2), (iniciar_y/2)+5);
        }
        iniciar_x = 0;
        iniciar_y = medida + 100;//se toman lo agregado de los otros dientes
        for (x=0; x<8; x++){//se dibujan otros 16 dientes
            iniciar_x =  ((x*medida) + (separacion_x*x) + separacion_x)+600;
            
            dibuja_contorno(context, iniciar_x, iniciar_y, medida, separacion_x, 10);
            /* Numero de diente */
            context.font = '10pt Calibri';
            context.textAlign = 'center';
            context.fillStyle = 'black';
            context.fillText('3'+(x+1), iniciar_x+(medida/2), (iniciar_y-10)+5);
        }

        //grupos de 4
        iniciar_x = 0;
        iniciar_y = medida + 200;//se toman lo agregado de los otros dientes
        for (x=0; x<5; x++){//se dibujan otros 16 dientes
            iniciar_x =  ((x*medida) + (separacion_x*x) + separacion_x)+150;
            dibuja_contorno(context, iniciar_x, iniciar_y, medida, separacion_x, 10);
            /* Numero de diente */
            context.font = '10pt Calibri';
            context.textAlign = 'center';
            context.fillStyle = 'black';
            context.fillText('5'+(x+1), iniciar_x+(medida/2), (iniciar_y-10)+5);
        }
        iniciar_x = 0;
        iniciar_y = medida + 300;//se toman lo agregado de los otros dientes
        for (x=0; x<5; x++){//se dibujan otros 16 dientes
            iniciar_x =  ((x*medida) + (separacion_x*x) + separacion_x)+150;
            dibuja_contorno(context, iniciar_x, iniciar_y, medida, separacion_x, 10);
            /* Numero de diente */
            context.font = '10pt Calibri';
            context.textAlign = 'center';
            context.fillStyle = 'black';
            context.fillText('8'+(x+1), iniciar_x+(medida/2), (iniciar_y-10)+5);
        }
        //grupos de 4
        iniciar_x = 40;
        iniciar_y = medida + 200;//se toman lo agregado de los otros dientes
        for (x=0; x<5; x++){//se dibujan otros 16 dientes
            iniciar_x =  ((x*medida) + (separacion_x*x) + separacion_x)+600;
            dibuja_contorno(context, iniciar_x, iniciar_y, medida, separacion_x, 10);
            /* Numero de diente */
            context.font = '10pt Calibri';
            context.textAlign = 'center';
            context.fillStyle = 'black';
            context.fillText('6'+(x+1), iniciar_x+(medida/2), (iniciar_y-10)+5);
        }
        iniciar_x = 0;
        iniciar_y = medida + 300;//se toman lo agregado de los otros dientes
        for (x=0; x<5; x++){//se dibujan otros 16 dientes
            iniciar_x =  ((x*medida) + (separacion_x*x) + separacion_x)+600;
            dibuja_contorno(context, iniciar_x, iniciar_y, medida, separacion_x, 10);
            /* Numero de diente */
            context.font = '10pt Calibri';
            context.textAlign = 'center';
            context.fillStyle = 'black';
            context.fillText('7'+(x+1), iniciar_x+(medida/2), (iniciar_y-10)+5);
        }
        //dibuja_seccion(context, 2, 3, 'red');
        //dibuja_seccion(context, 18, 5, 'green');
        //dibuja_seccion(context, 24, 4, 'blue');
        window.onload = function(){
            localStorage.clear();
            click();
        }
       

    </script>
</body>