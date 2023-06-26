USE unsis_smile;

-- inserta un alumno
DELIMITER $$
DROP PROCEDURE IF EXISTS insertarAlumno$$
CREATE PROCEDURE InsertarAlumno
(
in nombre varchar(50),
in nombre2 varchar(50),
in apellido varchar(50),
in apellido2 varchar(50),
in sexo char,
in curp varchar(20),
in idSemestreGrupo int,
-- in semestre varchar(4),
-- in grupo varchar(1),
in matricula varchar(10),
in telefono varchar(10),
in mail varchar(100)
)
BEGIN
	
    declare idUsuario int;
    declare idSemGrupo int;
    -- primero se crea un usuario y una contraseña para el administrador a insertar.
    -- sus credenciales seran su numero de trabajador y curp para user y pass, respectivamente.
    set idUsuario = spInsertarUsuario(matricula,curp,3);    
    -- set idSemGrupo = filtrarIdSemestreGrupo(semestre,grupo);    
    -- insertamos al nuevo alumno
	insert into alumnos(nombre,nombre2,apellido,apellido2,sexo,curp,fk_id_semestre_grupo,matricula,telefono,email_alumno,estatus,f_id_usuario)
    values(nombre,nombre2,apellido,apellido2,sexo,curp,idSemestreGrupo,matricula,telefono,mail,estatus,idUsuario);
end
$$
DELIMITER ;





-- INSERTAR ADMINISTRADOR
delimiter $$
drop procedure if exists insertarAdministrador$$
  create procedure insertarAdministrador(
  nombre1 varchar(50),
  nombre2 varchar(50),
  apellido1 varchar(50),
  apellido2 varchar(50),
  curp varchar(20),
  telefono varchar(10),
  numero_trabajador varchar(15),
  fecha_nacimiento date,
  sexo char,
  mail varchar(100))
begin
	
    declare idUsuario int;    
    -- primero se crea un usuario y una contraseña para el administrador a insertar.
    -- sus credenciales seran su numero de trabajador y curp para user y pass, respectivamente.       
    -- buscamos el ultimo id insertado en la tabla de usuarios
    set idUsuario = spInsertarUsuario(numero_trabajador,curp,1);
    -- insertamos el nuevo administrador
    insert into administradores(nombre1,nombre2,apellido1,apellido2,curp,
    telefono,numero_trabajador,fecha_nacimiento,sexo,email_admin,fk_usuario) 
	values(nombre1,nombre2,apellido1,apellido2,curp,telefono,numero_trabajador,fecha_nacimiento,sexo,mail,idUsuario);
	
end
$$
DELIMITER ;



-- insertar catedraticos
delimiter $$
drop procedure if exists insertarCatedratico$$
create procedure insertarCatedratico(
  nombre varchar(50),
  nombre2 varchar(50),
  apellido varchar(50),
  apellido2 varchar(50),
  curp varchar(20),
  telefono varchar(10),
  sexo char,
  fecha_nacimiento date,
  numero_trabajador varchar(15),
  mail varchar(100))
begin
	declare idUsuario int;    
    -- primero se crea un usuario y una contraseña para el administrador a insertar.
    -- sus credenciales seran su numero de trabajador y curp para user y pass, respectivamente. 
    -- buscamos el ultimo id insertado en la tabla de usuarios
    set idUsuario = spInsertarUsuario(numero_trabajador,curp,2);
	
	insert into catedraticos(nombre,nombre2,apellido,apellido2,curp,telefono,sexo,
    fecha_nacimiento,numero_trabajador,email_catedratico,fk_id_usuario)
	values(nombre,nombre2,apellido,apellido2,curp,telefono,sexo,fecha_nacimiento,
	numero_trabajador,mail,idUsuario);

end
$$
DELIMITER ;