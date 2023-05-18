use unsis_smile;

-- **********MOSTRAR ADMINISTRADORES************
-- lista todos los administradores
delimiter $$
drop procedure if exists obtenerTodosAdministradores$$
create procedure obtenerTodosAdministradores()
begin
	select * from administradores where estatus=1;
end
$$
DELIMITER ;

-- obtiene datos particulares de un administrador a traves del id
delimiter $$
drop procedure if exists obtenerAdministradores$$
  create procedure obtenerAdministradores(IN id_admin INT)
begin
	select nombre1,nombre2,apellido1,apellido2,numero_trabajador, fecha_nacimiento,sexo, email_admin from administradores where id_administrador=id_admin and estatus=1;
end
$$
DELIMITER ;

select * from administradores;
-- **********MOSTRAR ALUMNOS************
-- lista todos los alumnos
delimiter $$
drop procedure if exists obtenerTodosAlumnos$$
create procedure obtenerTodosAlumnos()
begin
	select * from alumnos where estatus=1;
end
$$
DELIMITER ;

-- obtiene datos particulares de un alumno a traves del id
delimiter $$
drop procedure if exists obtenerAlumno$$
  create procedure obtenerAlumno(IN id_alumno INT)
begin
with
	alum as(select id_alumno,nombre,nombre2,apellido,apellido2,sexo,curp,matricula,telefono,email_alumno,fk_id_semestre as id_semestre, fk_id_grupo as id_grupo from alumnos inner join semestre_grupo on alumnos.fk_id_semestre_grupo=semestre_grupo.id_semestre_grupo where alumnos.id_alumno=id_alumno and estatus=1)
    select id_alumno,nombre,nombre2,apellido,apellido2,sexo,curp,semestre,grupo,matricula,telefono,email_alumno from alum inner join grupo inner join semestres where alum.id_grupo=grupo.id_grupos and alum.id_semestre=semestres.id_semestre;
    -- select a.id_alumno,a.nombre,a.nombre2,a.apellido,a.apellido2,a.sexo,grupo, c.nombre,c.nombre2,c.apellido, c.apellido2 from alum_grupo as a inner join catedraticos as c on a.id_profe=c.id_catedratico;
end
$$
DELIMITER ;


-- **********MOSTRAR PROFESORES (catedráticos)************
-- lista todos los alumnos
delimiter $$
drop procedure if exists obtenerTodosCatedraticos$$
create procedure obtenerTodosCatedraticos()
begin
	select * from catedraticos where estatus=1;
end
$$

DELIMITER ;

-- obtiene datos particulares de un alumno a traves del id
delimiter $$
drop procedure if exists obtenerCatedratico$$
  create procedure obtenerCatedratico(IN id_cat INT)
begin
    select nombre,nombre2,apellido,apellido2,curp,telefono,sexo,fecha_nacimiento,numero_trabajador,email_catedratico from catedraticos where id_catedratico=id_cat;
end
$$
DELIMITER ;
select * from catedraticos;
delimiter $$
drop procedure if exists obtenerGrupoDeCatedratico$$
  create procedure obtenerGrupoDeCatedratico(IN id_cat INT)
begin
with
    c1 as (select id_semestre_grupo,semestre, fk_id_grupo from semestres as s inner join semestre_grupo as sg on s.id_semestre=sg.fk_id_semestre),
    grupos as(select c1.id_semestre_grupo as id_sg, concat(c1.semestre,g.grupo) as grupos from c1 inner join grupo as g on c1.fk_id_grupo=g.id_grupos order by c1.semestre asc)
    select grupos.grupos from grupos inner join catedratico_grupo on grupos.id_sg=catedratico_grupo.fk_id_semestre_grupo and catedratico_grupo.fk_id_catedratico=id_cat;
end
$$
DELIMITER ;

-- *******LISTAR PACIENTES POR ALUMNOS******
delimiter $$
drop procedure if exists obtenerPacientePorAlumno$$
create procedure obtenerPacientePorAlumno(IN id_alum INT)
begin
    select id_paciente, nombre1,nombre2,apellido1,apellido2,sexo,grupo_etnico,ocupacion,fecha_nacimiento,domicilio,estado_civil,religion,fecha_ingreso,nacionalidad,localidad,estatus
    from paciente as p inner join paciente_alumno as pa on p.id_paciente=pa.fk_id_paciente and pa.fk_id_alumno=id_alum and p.estatus=1;
end
$$
DELIMITER ;

