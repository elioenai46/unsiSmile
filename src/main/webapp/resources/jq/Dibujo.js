
// Funcion para dibujar las lineas de cada diente
function dibuja_contorno(context, inicio_x, inicio_y, med, separacion_x, separacion_y){
    var ctx = context;
    // Definiendo puntos de dibujo
    cua = med/4;
    ter = cua*3;
    /* 1ra zona */
    if(ctx){
        ctx.strokeStyle = color_line;
        ctx.beginPath();
        ctx.moveTo(inicio_x,inicio_y);
        ctx.lineTo(med+inicio_x,inicio_y);
        ctx.lineTo(ter+inicio_x,cua+inicio_y);
        ctx.lineTo(cua+inicio_x,cua+inicio_y);
        ctx.closePath();
        ctx.stroke();
    }
    /* 2da zona */
    if(ctx){
        ctx.strokeStyle = color_line;
        ctx.beginPath();
        ctx.moveTo(ter+inicio_x,cua+inicio_y);
        ctx.lineTo(med+inicio_x,inicio_y);
        ctx.lineTo(med+inicio_x,med+inicio_y);
        ctx.lineTo(ter+inicio_x,ter+inicio_y);
        ctx.closePath();
        ctx.stroke();
    }
    /* 3ra zona */
    if(ctx){
        ctx.strokeStyle = color_line;
        ctx.beginPath();
        ctx.moveTo(cua+inicio_x,ter+inicio_y);
        ctx.lineTo(ter+inicio_x,ter+inicio_y);
        ctx.lineTo(med+inicio_x,med+inicio_y);
        ctx.lineTo(inicio_x,med+inicio_y);
        ctx.closePath();
        ctx.stroke();
    }
    /* 4ta zona */
    if(ctx){
        ctx.strokeStyle = color_line;
        ctx.beginPath();
        ctx.moveTo(inicio_x,inicio_y);
        ctx.lineTo(cua+inicio_x,cua+inicio_y);
        ctx.lineTo(cua+inicio_x,ter+inicio_y);
        ctx.lineTo(inicio_x,med+inicio_y);
        ctx.closePath();
        ctx.stroke();
    }
}
// Funcion para pintar una region del diente
function dibuja_seccion(contexto, num_diente, seccion, color_pas){
    var ctx = contexto;
    // Definiendo puntos de dibujo
    med = medida;
    cua = med/4;
    ter = cua*3;
    num_diente = num_diente - 9;
    color_line = color_pas;
    if (num_diente<9){
        inicio_y = 20;
    }
    else{
        num_diente = num_diente - 16;
        inicio_y = med + 100;
        //if(num_diente==1){num_diente=0;}
    }
    //alert(num_diente);
    inicio_x = (num_diente*med) + (separacion_x*num_diente) + separacion_x;
    /* 1ra zona */
    if (seccion==1){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(inicio_x,inicio_y);
            ctx.lineTo(med+inicio_x,inicio_y);
            ctx.lineTo(ter+inicio_x,cua+inicio_y);
            ctx.lineTo(cua+inicio_x,cua+inicio_y);
            ctx.closePath();
            ctx.fill();
            ctx.strokeStyle = 'black';
            ctx.stroke();
        }
    }
    /* 2da zona */
    if (seccion==2){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(ter+inicio_x,cua+inicio_y);
            ctx.lineTo(med+inicio_x,inicio_y);
            ctx.lineTo(med+inicio_x,med+inicio_y);
            ctx.lineTo(ter+inicio_x,ter+inicio_y);
            ctx.closePath();
            ctx.fill();
            ctx.strokeStyle = 'black';
            ctx.stroke();
        }
    }
    /* 3ra zona */
    if (seccion==3){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(cua+inicio_x,ter+inicio_y);
            ctx.lineTo(ter+inicio_x,ter+inicio_y);
            ctx.lineTo(med+inicio_x,med+inicio_y);
            ctx.lineTo(inicio_x,med+inicio_y);
            ctx.closePath();
            ctx.fill();
            ctx.strokeStyle = 'black';
            ctx.stroke();
        }
    }
    /* 4ta zona */
    if (seccion==4){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(inicio_x,inicio_y);
            ctx.lineTo(cua+inicio_x,cua+inicio_y);
            ctx.lineTo(cua+inicio_x,ter+inicio_y);
            ctx.lineTo(inicio_x,med+inicio_y);
            ctx.closePath();
            ctx.fill();
            ctx.strokeStyle = 'black';
            ctx.stroke();
        }
    }
    /* 5ta zona(medio) */
    if (seccion==5){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(cua+inicio_x,cua+inicio_y);
            ctx.lineTo(ter+inicio_x,cua+inicio_y);
            ctx.lineTo(ter+inicio_x,ter+inicio_y);
            ctx.lineTo(cua+inicio_x,ter+inicio_y);
            ctx.closePath();
            ctx.fill();
            ctx.strokeStyle = 'black';
            ctx.stroke();
        }
    }
}
//
// Funcion para sombrear
function marcar_seccion(contexto, num_diente, seccion, color_pas){
    var ctx = contexto;
    // Definiendo puntos de dibujo
    med = medida;
    cua = med/4;
    ter = cua*3;
    num_diente = num_diente - 9;
    color_line = color_pas;
    if (num_diente<16){
        inicio_y = 20;
    }
    else{
        num_diente = num_diente - 16;
        inicio_y = med + 100;
        //if(num_diente==1){num_diente=0;}
    }
    //alert(num_diente);
    inicio_x = ((num_diente*med) + (separacion_x*num_diente) + separacion_x);
    /* 1ra zona */
    if (seccion==1){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(inicio_x,inicio_y);
            ctx.lineTo(med+inicio_x,inicio_y);
            ctx.lineTo(ter+inicio_x,cua+inicio_y);
            ctx.lineTo(cua+inicio_x,cua+inicio_y);
            ctx.closePath();
            //ctx.fill();
            ctx.strokeStyle = 'yellow';
            ctx.stroke();
        }
    }
    /* 2da zona */
    if (seccion==2){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(ter+inicio_x,cua+inicio_y);
            ctx.lineTo(med+inicio_x,inicio_y);
            ctx.lineTo(med+inicio_x,med+inicio_y);
            ctx.lineTo(ter+inicio_x,ter+inicio_y);
            ctx.closePath();
            //ctx.fill();
            ctx.strokeStyle = 'yellow';
            ctx.stroke();
        }
    }
    /* 3ra zona */
    if (seccion==3){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(cua+inicio_x,ter+inicio_y);
            ctx.lineTo(ter+inicio_x,ter+inicio_y);
            ctx.lineTo(med+inicio_x,med+inicio_y);
            ctx.lineTo(inicio_x,med+inicio_y);
            ctx.closePath();
            //ctx.fill();
            ctx.strokeStyle = 'yellow';
            ctx.stroke();
        }
    }
    /* 4ta zona */
    if (seccion==4){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(inicio_x,inicio_y);
            ctx.lineTo(cua+inicio_x,cua+inicio_y);
            ctx.lineTo(cua+inicio_x,ter+inicio_y);
            ctx.lineTo(inicio_x,med+inicio_y);
            ctx.closePath();
            //ctx.fill();
            ctx.strokeStyle = 'yellow';
            ctx.stroke();
        }
    }
    /* 5ta zona(medio) */
    if (seccion==5){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(cua+inicio_x,cua+inicio_y);
            ctx.lineTo(ter+inicio_x,cua+inicio_y);
            ctx.lineTo(ter+inicio_x,ter+inicio_y);
            ctx.lineTo(cua+inicio_x,ter+inicio_y);
            ctx.closePath();
            //ctx.fill();
            ctx.strokeStyle = 'yellow';
            ctx.stroke();
        }
    }
}
function marcar_seccionder(contexto, num_diente, seccion, color_pas){
    var ctx = contexto;
    // Definiendo puntos de dibujo
    med = medida;
    cua = med/4;
    ter = cua*3;
    num_diente = num_diente - 9;
    color_line = color_pas;
    if (num_diente<9){
        inicio_y = 20;
    }
    else{
        num_diente = num_diente - 16;
        inicio_y = med + 100;
        //if(num_diente==1){num_diente=0;}
    }
    //alert(num_diente);
    inicio_x = (((num_diente*med) + (separacion_x*num_diente) + separacion_x))+600;
    /* 1ra zona */
    if (seccion==1){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(inicio_x,inicio_y);
            ctx.lineTo(med+inicio_x,inicio_y);
            ctx.lineTo(ter+inicio_x,cua+inicio_y);
            ctx.lineTo(cua+inicio_x,cua+inicio_y);
            ctx.closePath();
            //ctx.fill();
            ctx.strokeStyle = 'yellow';
            ctx.stroke();
        }
    }
    /* 2da zona */
    if (seccion==2){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(ter+inicio_x,cua+inicio_y);
            ctx.lineTo(med+inicio_x,inicio_y);
            ctx.lineTo(med+inicio_x,med+inicio_y);
            ctx.lineTo(ter+inicio_x,ter+inicio_y);
            ctx.closePath();
            //ctx.fill();
            ctx.strokeStyle = 'yellow';
            ctx.stroke();
        }
    }
    /* 3ra zona */
    if (seccion==3){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(cua+inicio_x,ter+inicio_y);
            ctx.lineTo(ter+inicio_x,ter+inicio_y);
            ctx.lineTo(med+inicio_x,med+inicio_y);
            ctx.lineTo(inicio_x,med+inicio_y);
            ctx.closePath();
            //ctx.fill();
            ctx.strokeStyle = 'yellow';
            ctx.stroke();
        }
    }
    /* 4ta zona */
    if (seccion==4){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(inicio_x,inicio_y);
            ctx.lineTo(cua+inicio_x,cua+inicio_y);
            ctx.lineTo(cua+inicio_x,ter+inicio_y);
            ctx.lineTo(inicio_x,med+inicio_y);
            ctx.closePath();
            //ctx.fill();
            ctx.strokeStyle = 'yellow';
            ctx.stroke();
        }
    }
    /* 5ta zona(medio) */
    if (seccion==5){
        if(ctx){
            ctx.fillStyle = color_line;
            ctx.beginPath();
            ctx.moveTo(cua+inicio_x,cua+inicio_y);
            ctx.lineTo(ter+inicio_x,cua+inicio_y);
            ctx.lineTo(ter+inicio_x,ter+inicio_y);
            ctx.lineTo(cua+inicio_x,ter+inicio_y);
            ctx.closePath();
            //ctx.fill();
            ctx.strokeStyle = 'yellow';
            ctx.stroke();
        }
    }
}
// Funcion para sombrear diente completo
function marcar_diente(contexto, num_diente, color_pas){
    var ctx = contexto;
    // Definiendo puntos de dibujo
    med = medida;
    num_diente = num_diente - 9;
    color_line = color_pas;
    if (num_diente<9){
        inicio_y = 20;
    }
    else{
        num_diente = num_diente - 16;
        inicio_y = med + 100;
    }
    //alert(num_diente);
    inicio_x = (num_diente*med) + (separacion_x*num_diente) + separacion_x;

    ctx.fillStyle = color_line;
    ctx.beginPath();
    ctx.moveTo(inicio_x,inicio_y);
    ctx.lineTo(inicio_x+40,inicio_y);
    ctx.lineTo(inicio_x+40,inicio_y+40);
    ctx.lineTo(inicio_x,inicio_y+40);
    ctx.closePath();
    ctx.strokeStyle = color_line;
    ctx.stroke();
}
// Funcion para sombrear diente completo
function marcar_extraccion(contexto, num_diente, color_pas){
    var ctx = contexto;
    // Definiendo puntos de dibujo
    med = medida;
    num_diente = num_diente - 9;
    color_line = color_pas;
    if (num_diente<9){
        inicio_y = 20;
    }
    else{
        num_diente = num_diente - 16;
        inicio_y = med + 100;
    }
    //alert(num_diente);
    inicio_x = (num_diente*med) + (separacion_x*num_diente) + separacion_x;

    ctx.fillStyle = color_line;
    ctx.beginPath();
    ctx.lineWidth = 3;
    ctx.moveTo(inicio_x,inicio_y);
    ctx.lineTo(inicio_x+40,inicio_y+40);
    ctx.moveTo(inicio_x+40,inicio_y);
    ctx.lineTo(inicio_x,inicio_y+40);
    ctx.stroke();
    ctx.lineWidth = 1;
}
// Funcion para marcar puente
function marcar_puente(contexto, dient_1, dient_2, color_pas){
    var ctx = contexto;
    // Definiendo puntos de dibujo
    med = medida;
    num_diente1 = dient_1 - 9;
    num_diente2 = dient_2 - 9;
    color_line = color_pas;
    if (num_diente1<16){
        inicio_y = 80;
    }
    else{
        num_diente1 = num_diente1 - 16;
        num_diente2 = num_diente2 - 16;
        inicio_y = med + 160;
    }
    //alert(num_diente);
    inicio_x = (num_diente1*med) + (separacion_x*num_diente1) + separacion_x + (med/2);
    fin_x = (num_diente2*med) + (separacion_x*num_diente2) + separacion_x + (med/2);
    ctx.fillStyle = color_line;
    ctx.beginPath();
    ctx.lineWidth = 4;
    ctx.moveTo(inicio_x,inicio_y);
    ctx.lineTo(fin_x,inicio_y);
    //ctx.moveTo(inicio_x+40,inicio_y);
    //ctx.lineTo(inicio_x,inicio_y+40);
    ctx.stroke();
    ctx.lineWidth = 1;
}
// Funcion para borrar dientes
function borrar_diente(contexto, num_diente){
    ctx = contexto;
    // Definiendo puntos de dibujo
    med = medida;
    num_diente = num_diente - 9;
    if (num_diente<9){
        inicio_y = 20;
    }
    else{
        num_diente = num_diente - 16;
        inicio_y = med + 100;
    }
    //alert(num_diente);
    inicio_x = (num_diente*med) + (separacion_x*num_diente) + separacion_x;
    ctx.clearRect(inicio_x, inicio_y, med, med);
}