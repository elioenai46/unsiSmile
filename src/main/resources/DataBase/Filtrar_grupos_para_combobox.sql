use unsis_smile;
  
-- filtrar grupos
DELIMITER $$
drop procedure if exists filtrarGrupos$$
create procedure filtrarGrupos(
semestreAux varchar(10))
begin
	with
	c1 as (select semestre, fk_id_grupo from semestres as s inner join semestre_grupo as sg on s.id_semestre=sg.fk_id_semestre)
    select g.grupo from c1 inner join grupo as g on c1.fk_id_grupo=g.id_grupos where c1.semestre=semestreAux order by c1.semestre asc;
end
$$
DELIMITER ;

-- filtrar grupos
DELIMITER $$
drop procedure if exists filtrarIdSemestreGrupo$$
create procedure filtrarIdSemestreGrupo(
semestreAux varchar(10),
grupoAux varchar(1)
)
begin
	with
	c1 as (select semestre, id_semestre_grupo, fk_id_grupo from semestres as s inner join semestre_grupo as sg on s.id_semestre=sg.fk_id_semestre)
    select c1.id_semestre_grupo from c1 inner join grupo as g on c1.fk_id_grupo=g.id_grupos where c1.semestre=semestreAux and g.grupo=grupoAux order by c1.id_semestre_grupo asc;
end
$$
DELIMITER ;
