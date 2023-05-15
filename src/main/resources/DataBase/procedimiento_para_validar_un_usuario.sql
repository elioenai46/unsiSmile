use unsis_smile;



-- PROCEDIMIENTO PARA VALIDAR LA EXISTENCIA Y RELACIÓN DE UN USUARIO
DELIMITER $$
drop procedure if exists spValidarUsuarioRol$$
CREATE PROCEDURE spValidarUsuarioRol (IN nombre_usuario VARCHAR(50), IN pass_usuario VARCHAR(50), OUT id_grl INT, OUT _nombre_rol VARCHAR(50))
begin
declare id_user int;
-- declare id_grl int;
-- guardamos el id del usuario
	select id_usuario from usuarios where usuarios.nombre_usuario = nombre_usuario and usuarios.pass_usuario=pass_usuario and estatus=1 into id_user;

-- buscamos el alumno al que le corresponde dicho usuario, si no lo encuentra entonces busca en catedratico, de no encontrarlo buscará en administrador
select id_alumno from alumnos where f_id_usuario=id_user into id_grl;
if id_grl is null then
	select id_catedratico from catedraticos where fk_id_usuario=id_user into id_grl;
end if;
if id_grl is null then
	select id_administrador from administradores where fk_usuario=id_user into id_grl;
end if;

-- SET ID = id_grl;
-- if para asignar el tipo de rol a la variable _nombre_rol, si el usuario dado está relacionado con un alumno, administrador o catedratico existenete     
IF id_grl IS NULL THEN
	set _nombre_rol='not found';
	else
		with 
			x as(select f_id_rol as id from usuarios where id_usuario=id_user)
               select nombre_rol from roles_tipos_usuario as rtu inner join x on rtu.id_rol=x.id into _nombre_rol;
END IF;
     
end
$$
delimiter ;



-- PROCEDIMIENTO PARA LISTAR LOS SEMESTRES Y GRUPOS QUE POSEE

DELIMITER $$
drop procedure if exists spListarSemestreGrupo$$
CREATE PROCEDURE spListarSemestreGrupo ()
begin
	select id_semestre_grupo, semestre, grupo from semestres as s inner join semestre_grupo as s1 on s.id_semestre=s1.fk_id_semestre
		inner join grupo as g where g.id_grupos= s1.fk_id_grupo order by id_semestre asc;
end
$$
DELIMITER ;



-- funcion para insertar usuarios
DELIMITER $$
drop function if exists spInsertarUsuario$$
CREATE FUNCTION spInsertarUsuario (usuario VARCHAR(20), contrasenia VARCHAR(15), f_id_rol int)
RETURNS INT
deterministic
BEGIN
    DECLARE id INT;
    INSERT INTO usuarios (nombre_usuario, pass_usuario, f_id_rol) VALUES (usuario, contrasenia, f_id_rol);
    SET id = LAST_INSERT_ID();
    RETURN id;
END;

$$
DELIMITER ;


