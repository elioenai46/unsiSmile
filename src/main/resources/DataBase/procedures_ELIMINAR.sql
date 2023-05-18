USE unsis_smile;

-- eliminar alumnos
DELIMITER $$
DROP PROCEDURE IF EXISTS eliminarAlumno$$
CREATE PROCEDURE eliminarAlumno
(
in id_alumnoAux int
)
BEGIN   
	declare id_user int;
    select f_id_usuario from alumnos where id_alumno=id_alumnoAux into id_user;
    update alumnos set estatus=0 where id_alumno=id_alumnoAux;
    update usuarios set estatus=0 where id_usuario=id_user;
end
$$
DELIMITER ;

-- eliminar administradores
DELIMITER $$
DROP PROCEDURE IF EXISTS eliminarAdministrador$$
CREATE PROCEDURE eliminarAdministrador
(
in id_admin int
)
BEGIN   
	declare id_user int;
    select fk_usuario from administradores where id_administrador=id_admin into id_user;
    update administradores set estatus=0 where id_administrador=id_admin;
    update usuarios set estatus=0 where id_usuario=id_user;
end
$$
DELIMITER ;

-- eliminar catedraticos
DELIMITER $$
DROP PROCEDURE IF EXISTS eliminarCatedratico$$
CREATE PROCEDURE eliminarCatedratico
(
in id_cat int
)
BEGIN   
	declare id_user int;
    select fk_id_usuario from catedraticos where id_catedratico=id_cat into id_user;
    update catedraticos set estatus=0 where id_catedratico=id_cat;
    update usuarios set estatus=0 where id_usuario=id_user;
end
$$
DELIMITER ;
