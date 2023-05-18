use unsis_smile;

-- insertamos los grupos 
insert into semestres(semestre) values ('113'),('213'),('313'),('413'),('513'),('613'),('713'),('813'),('913'),('1013');

insert into grupo(grupo) values ('A'),('B'),('C'),('D'),('E');

insert into semestre_grupo(fk_id_grupo,fk_id_semestre) values (1,1),(2,2),(3,3),(4,4),(5,5);
insert into semestre_grupo(fk_id_grupo,fk_id_semestre) values (2,1),(3,1),(4,1),(5,1);

-- insertamos los roles de los usuarios del sistema
insert into roles_tipos_usuario(nombre_rol) values ('Administrador'),('Profesor'),('Alumno');

-- agregamos usuarios a la base de datos
INSERT INTO usuarios (nombre_usuario, pass_usuario, f_id_rol)
VALUES ('juan.gonzalez', 'pass', 1),
       ('ana.karenina', 'pass', 1),
       ('luis.hernandez', 'pass', 1),
       ('sofia.ramirez', 'pass', 1),
       ('jose.torres', 'pass', 1),
       ('mariana.gutierrez', 'pass', 1),
       ('eduardo.flores', 'pass', 1),
       ('ana.lopez', 'pass', 1),
       ('leo.aa', 'pass', 1),
       ('cris.rdos', 'pass', 1);

INSERT INTO usuarios (nombre_usuario, pass_usuario, f_id_rol)
VALUES ('juan_garcia', 'password1',2),
	('ana_gonzalez', 'password2',2),
	('santiago_hernandez', 'password3',2),
	('maria_gutierrez', 'password4',2),
	('fernando_lopez', 'password5',2),
	('gabriela_martinez', 'password6',2),
	('jorge_morales', 'password7',2),
	('laura_perez', 'password8',2),
	('roberto_ramirez', 'password9',2),
	('carmen_rodriguez', 'password10',2);

INSERT INTO usuarios(nombre_usuario, pass_usuario, f_id_rol)
VALUES 
('anamaria', 'anamaria123', 3),
('juancarlos', 'juancarlos123', 3),
('mariajose', 'mariajose123', 3),
('pedroantonio', 'pedroantonio123', 3),
('analuisa', 'analuisa123', 3),
('luismiguel', 'luismiguel123', 3),
('monicapatricia', 'monipati123', 3),
('jorgealberto', 'jorgealberto123', 3),
('mariaelena', 'mariaelena123', 3),
('fernandoantonio', 'ferantonio123', 3);


-- agregamos a los administradores de la aplicacion
/*insert into administradores(nombre1,nombre2,apellido1,apellido2,numero_trabajador,fecha_nacimiento,sexo,fk_usuario) 
values('Carlos','Aurelio','Alcantara','Perez','2546',"2001-01-23",'M',1),
('Getzemani','Alejandro','Martinez','Rodriguez','3054',"2000-06-12",'M',2);*/


INSERT INTO administradores (nombre1, nombre2, apellido1, apellido2, numero_trabajador, fecha_nacimiento, sexo, email_admin, fk_usuario)
VALUES
('Juan', 'Carlos', 'González', 'López', '1234', '1990-05-12', 'M', 'juan.gonzalez@email.com', 1),
('Ana', 'Karenina', 'García', 'Flores', '5678', '1985-02-18', 'F', 'ana.karenina@email.com', 2),
('Luis', 'Antonio', 'Hernández', 'Hernández', '9101', '1982-09-23', 'M', 'luis.hernandez@email.com', 3),
('Sofía', NULL, 'Ramírez', 'Ramírez', '1213', '1995-11-05', 'F', 'sofia.ramirez@email.com', 4),
('José', 'Manuel', 'Torres', 'Torres', '1415', '1988-07-14', 'M', 'jose.torres@email.com', 5),
('Mariana', NULL, 'Gutiérrez', 'Gutiérrez', '1617', '1992-03-29', 'F', 'mariana.gutierrez@email.com', 6),
('Eduardo', NULL, 'Flores', 'Flores', '1819', '1998-01-20', 'M', 'eduardo.flores@email.com', 7),
('Ana', 'Sofía', 'López', 'Sánchez', '2021', '1991-12-07', 'F', 'ana.lopez@email.com', 8),
('Leonel','Ronaldo','Aguilar','Aguilar','4054',"2000-06-12",'M','leo.aa@email.com',9),
('Cristiano','Ronaldo','DosSantos','Aveiro','7777',"2000-06-12",'M','cris.rdos@email.com',10);




-- agregamos datos de los profesores
INSERT INTO catedraticos (nombre, nombre2, apellido, apellido2, curp, telefono, sexo, fecha_nacimiento, numero_trabajador, email_catedratico, fk_id_usuario) VALUES
('Juan', 'Carlos', 'García', 'Sánchez', 'GACS880101HDFRNR09', '5555555555', 'M', '1988-01-01', 'NT12345', 'jcgarcia@example.com', 11),
('Ana', 'Isabel', 'González', 'Hernández', 'GOHA900211MDFNNS05', '5555555555', 'F', '1990-02-11', 'NT67890', 'aigonzalez@example.com', 12),
('Santiago', 'Javier', 'Hernández', 'Martínez', 'HEMS930709HDFRRN03', '5555555555', 'M', '1993-07-09', 'NT24680', 'sjhernandez@example.com', 13),
('María', 'Isabel', 'Gutiérrez', 'Ramírez', 'GURM870318MDFTRR04', '5555555555', 'F', '1987-03-18', 'NT13579', 'migutierrez@example.com', 14),
('Fernando', 'Alberto', 'López', 'Castillo', 'LOCF750201HDFPLR06', '5555555555', 'M', '1975-02-01', 'NT86420', 'falopez@example.com', 15),
('Gabriela', 'Alejandra', 'Martínez', 'Pérez', 'MAPG960522MDFRZR01', '5555555555', 'F', '1996-05-22', 'NT97531', 'gamartinez@example.com', 16),
('Jorge', 'Luis', 'Morales', 'Santos', 'MOST810416HDFRRR02', '5555555555', 'M', '1981-04-16', 'NT64208', 'jlmorales@example.com', 17),
('Laura', 'Patricia', 'Pérez', 'García', 'PEGJ780907MDFRRC08', '5555555555', 'F', '1978-09-07', 'NT75391', 'lpperez@example.com', 18),
('Roberto', 'Carlos', 'Ramírez', 'Hernández', 'RAHR920730HDFMRB09', '5555555555', 'M', '1992-07-30', 'NT36985', 'rcramirez@example.com', 19),
('Carmen', 'Isabel', 'Rodríguez', 'Gutiérrez', 'ROGC890511MDFDMM06', '5555555555', 'F', '1989-05-11', 'NT48075', 'cirodriguez@example.com', 20);

	-- asignamos un grupo al catedratico
/*insert into catedratico_grupo(fk_id_catedratico,fk_id_semestre_grupo) values (1,3);-- ,(2,1),(3,3),(4,2),(5,1),(6,4);
select * from catedratico_grupo;
select * from catedraticos;
use unsis_smile;*/





-- agregamos datos de alumnos
INSERT INTO alumnos(nombre, nombre2, apellido, apellido2, sexo, curp, fk_id_semestre_grupo, matricula, telefono, email_alumno, f_id_usuario)
VALUES 
('Ana', 'María', 'García', 'Sánchez', 'F', 'GASA920416MCLRLNA6', 4, '2023000011', '5551234567', 'anamaria@gmail.com', 21),
('Juan', 'Carlos', 'Pérez', 'García', 'M', 'PECG930517HCLRRN07', 6, '2023000012', '5552345678', 'juancarlos@hotmail.com', 22),
('María', 'José', 'Hernández', 'González', 'F', 'HEGM870101MCLRNR00', 8, '2023000013', '5553456789', 'mariajose@yahoo.com', 23),
('Pedro', 'Antonio', 'Sánchez', 'López', 'M', 'SALP990605HCLRRD02', 6, '2023000014', '5554567890', 'pedroantonio@gmail.com', 24),
('Ana', 'Luisa', 'Martínez', 'Vázquez', 'F', 'MAVA780502MCLRZN09', 2, '2023000015', '5555678901', 'analuisa@hotmail.com', 25),
('Luis', 'Miguel', 'Gómez', 'Pérez', 'M', 'GOPP850310HCLRSL02', 4, '2023000016', '5556789012', 'luismiguel@gmail.com', 26),
('Mónica', 'Patricia', 'González', 'Ruiz', 'F', 'GORM810611MCLRZN05', 6, '2023000017', '5557890123', 'monicapatricia@yahoo.com', 27),
('Jorge', 'Alberto', 'Rodríguez', 'Sánchez', 'M', 'ROSS900102HCLRRR04', 8, '2023000018', '5558901234', 'jorgealberto@hotmail.com', 28),
('María', 'Elena', 'Díaz', 'Hernández', 'F', 'DIHM880818MCLRNL02', 4, '2023000019', '5559012345', 'mariaelena@gmail.com', 29),
('Fernando', 'Antonio', 'Mendoza', 'García', 'M', 'MEGF830513HCLRNN07', 2, '2023000020', '5550123456', 'fernandoantonio@yahoo.com', 30);

