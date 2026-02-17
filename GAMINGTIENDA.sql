
DROP TABLE IF EXISTS Devoluciones CASCADE;
DROP TABLE IF EXISTS Reservaciones CASCADE;
DROP TABLE IF EXISTS Ticket CASCADE;
DROP TABLE IF EXISTS Ventas CASCADE;
DROP TABLE IF EXISTS Coleccionable CASCADE;
DROP TABLE IF EXISTS Dlc CASCADE;
DROP TABLE IF EXISTS Membresia CASCADE;
DROP TABLE IF EXISTS Articulos_diversos CASCADE;
DROP TABLE IF EXISTS Videojuegos CASCADE;
DROP TABLE IF EXISTS Productos CASCADE;
DROP TABLE IF EXISTS Usuario CASCADE;
DROP TABLE IF EXISTS Tienda CASCADE;
DROP TABLE IF EXISTS Genero CASCADE;
DROP TABLE IF EXISTS Plataforma CASCADE;
DROP TABLE IF EXISTS Restriccion CASCADE;
DROP TABLE IF EXISTS Estado CASCADE;
DROP TABLE IF EXISTS Formato CASCADE;
DROP TABLE IF EXISTS Estado_devolucion CASCADE;

CREATE TABLE Tienda(
   id_tienda SERIAL PRIMARY KEY,
   sucursal VARCHAR(50) NOT NULL,
   descripcion VARCHAR(50)
);
INSERT INTO Tienda (sucursal, descripcion) VALUES
('Sucursal Centro', 'Tienda principal en el centro');

CREATE TABLE Usuario (
   id_usuario SERIAL PRIMARY KEY,
   id_tienda INT REFERENCES Tienda(id_tienda) ON DELETE CASCADE,
   correo VARCHAR(50),
   nombre VARCHAR(50) NOT NULL,
   fecha_nacimiento DATE,
   direccion VARCHAR(50)
);
INSERT INTO Usuario (id_tienda, correo, nombre, fecha_nacimiento, direccion) VALUES
(1, 'carlos@mail.com', 'Carlos', '1993-07-15', 'Calle Árbol 123'),
(1, 'laura@mail.com', 'Laura', '1988-09-30', 'Avenida Verde 456'),
(1, 'daniel@mail.com', 'Daniel', '2000-11-12', 'Boulevard Azul 789'),
(1, 'paula@mail.com', 'Paula', '1995-01-25', 'Calle Fuego 101'),
(1, 'jorge@mail.com', 'Jorge', '1994-04-18', 'Camino Real 202'),
(1, 'paty@mail.com', 'Patricia', '1996-08-14', 'Colonia Norte 303'),
(1, 'felipe@mail.com', 'Felipe', '1992-12-21', 'Paseo del Lago 404'),
(1, 'gabriela@mail.com', 'Gabriela', '2001-05-06', 'Sendero del Sol 505'),
(1, 'ricardo@mail.com', 'Ricardo', '1998-10-03', 'Circuito Luna 606'),
(1, 'diana@mail.com', 'Diana', '1997-03-29', 'Privada Estrella 707'),
(1, 'hector@mail.com', 'Héctor', '1990-06-11', 'Ruta del Viento 808'),
(1, 'susana@mail.com', 'Susana', '1999-01-17', 'Callejón Oscuro 909'),
(1, 'miguel@mail.com', 'Miguel', '1991-09-09', 'Eje Central 010'),
(1, 'pamela@mail.com', 'Pamela', '2003-02-22', 'Calle Sur 111'),
(1, 'ivan@mail.com', 'Iván', '1993-03-13', 'Diagonal Norte 121'),
(1, 'adriana@mail.com', 'Adriana', '1996-04-04', 'Calle Dorada 131'),
(1, 'emilio@mail.com', 'Emilio', '2002-05-05', 'Colonia Jardines 141'),
(1, 'isabel@mail.com', 'Isabel', '2000-06-06', 'Circuito Brisas 151'),
(1, 'julian@mail.com', 'Julián', '1995-07-07', 'Camino Blanco 161'),
(1, 'carla@mail.com', 'Carla', '1997-08-08', 'Sendero Verde 171'),
(1, 'jose@mail.com', 'José', '1994-09-09', 'Paseo del Mar 181'),
(1, 'paulina@mail.com', 'Paulina', '1998-10-10', 'Avenida del Río 191'),
(1, 'roberto@mail.com', 'Roberto', '2000-11-11', 'Calle Real 201'),
(1, 'marcela@mail.com', 'Marcela', '1992-12-12', 'Privada del Sol 211'),
(1, 'sergio@mail.com', 'Sergio', '1996-01-01', 'Boulevard Norte 221'),
(1, 'monica@mail.com', 'Mónica', '1993-02-02', 'Eje 3 Oriente 231'),
(1, 'kevin@mail.com', 'Kevin', '1997-03-03', 'Colonia Roma 241'),
(1, 'alejandra@mail.com', 'Alejandra', '1999-04-04', 'Avenida Juárez 251'),
(1, 'francisco@mail.com', 'Francisco', '1989-05-05', 'Colonia Centro 261'),
(1, 'berenice@mail.com', 'Berenice', '1990-06-06', 'Avenida Reforma 271'),
(1, 'eduardo@mail.com', 'Eduardo', '2001-07-07', 'Calzada México 281'),
(1, 'nancy@mail.com', 'Nancy', '2002-08-08', 'Calle Independencia 291'),
(1, 'raul@mail.com', 'Raúl', '1995-09-09', 'Privada Norte 301'),
(1, 'lucia@mail.com', 'Lucía', '1998-10-10', 'Circuito Oriente 311'),
(1, 'omar@mail.com', 'Omar', '1994-11-11', 'Colonia Sur 321'),
(1, 'veronica@mail.com', 'Verónica', '1996-12-12', 'Calle Hidalgo 331');

CREATE TABLE Productos (
    id_producto SERIAL PRIMARY KEY,
	id_tienda INT REFERENCES Tienda(id_tienda) ON DELETE CASCADE,
    producto VARCHAR(200) NOT NULL,
    precio NUMERIC(10, 2) NOT NULL
);
INSERT INTO Productos (producto, precio) VALUES
-- Videojuegos
('GOD OF WAR RAGNAROK', 1499.00),
('MINECRAFT', 1299.00),
('THE LEGEND OF ZELDA TEARS OF THE KINGDOM', 999.00),
('ARK: Survival Ascended', 499.00),
('CRASH BANDICOOT NSANE TRILOGY', 1299.00),
-- Membresías
('Game Pass', 399.00),
('Game Pass Ultimate', 499.00),
('PS Plus+', 399.00),
('Nintendo', 499.00),
('Play Store', 199.00),
-- DLCs
('Personajes', 199.00),
('Monedas', 99.00),
('Mapa/Nivel', 149.00),
('Season Pass', 199.00),
('Cosmeticos', 99.00),
-- Coleccionables
('Figuras', 699.00),
('Funko Pop', 499.00),
('Cartas', 299.00),
('Hot Toys', 1499.00),
('Peluche', 799.00),

('FIFA 25', 1399.00),
('Call of Duty: Black Ops 6', 1599.00),
('Spider-Man 2', 1499.00),
('Hogwarts Legacy', 1199.00),
('Resident Evil 4 Remake', 1299.00),
('Cyberpunk 2077', 1099.00),
('Starfield', 1299.00),
('Assassins Creed Mirage', 999.00),
('Mortal Kombat 1', 1199.00),
('Gran Turismo 7', 1199.00),

-- Membresías/DLCs/Coleccionables adicionales
('EA Play', 299.00),
('Ubisoft+', 399.00),
('Paquete de armas', 199.00),
('Modo historia extra', 149.00),
('Skin legendaria', 99.00),
('Llavero edición especial', 149.00),
('Póster de colección', 79.00),
('Figura edición limitada', 999.00),
('Vinilo musical del juego', 399.00),
('Camiseta oficial', 499.00);

CREATE TABLE Genero (
    id_genero SERIAL PRIMARY KEY,
    genero_nombre VARCHAR(50) NOT NULL UNIQUE
);
INSERT INTO Genero (genero_nombre) VALUES 
('Acción'), ('Aventura'), ('Deportes'), ('Disparos'), ('Puzzle');

CREATE TABLE Plataforma (
    id_plataforma SERIAL PRIMARY KEY,
    plataforma_nombre VARCHAR(50) NOT NULL UNIQUE
);
INSERT INTO Plataforma (plataforma_nombre) VALUES 
('PlayStation'), ('Nintendo'), ('Xbox'), ('PC');

CREATE TABLE Restriccion (
    id_restriccion SERIAL PRIMARY KEY,
    restriccion_edad VARCHAR(50) NOT NULL UNIQUE
);
INSERT INTO Restriccion (restriccion_edad) VALUES 
('E'), ('E10+'), ('T+15'), ('M+17'), ('A+18');

CREATE TABLE Estado (
    id_estado SERIAL PRIMARY KEY,
    estado_nombre VARCHAR(20) NOT NULL UNIQUE
);
INSERT INTO Estado (estado_nombre) VALUES 
('Nuevo'), ('Seminuevo');

CREATE TABLE Formato (
    id_formato SERIAL PRIMARY KEY,
    formato_nombre VARCHAR(20) NOT NULL UNIQUE
);
INSERT INTO Formato (formato_nombre) VALUES 
('Digital'), ('Físico');

CREATE TABLE Videojuegos (
    id_videojuego SERIAL PRIMARY KEY,
    id_producto INT REFERENCES Productos(id_producto) ON DELETE CASCADE,
    id_genero INT REFERENCES Genero(id_genero),
    id_plataforma INT REFERENCES Plataforma(id_plataforma),
    id_restriccion INT REFERENCES Restriccion(id_restriccion),
    id_estado INT REFERENCES Estado(id_estado),
    id_formato INT REFERENCES Formato(id_formato)
);

-- Recordando que los productos 1 a 5 son videojuegos
INSERT INTO Videojuegos (id_producto, id_genero, id_plataforma, id_restriccion, id_estado, id_formato)
VALUES
(1, 1, 1, 4, 1, 1),  -- GOD OF WAR RAGNAROK
(2, 2, 3, 1, 2, 2),  -- MINECRAFT
(3, 2, 2, 2, 1, 1),  -- ZELDA
(4, 4, 4, 4, 1, 1),  -- ARK
(5, 2, 3, 3, 1, 2),  -- CRASH
(21, 1, 3, 3, 1, 1),
(22, 4, 1, 5, 1, 2),
(23, 1, 1, 4, 1, 1),
(24, 2, 2, 3, 1, 2),
(25, 1, 3, 4, 2, 1),
(26, 5, 4, 2, 1, 2),
(27, 1, 2, 5, 1, 1),
(28, 1, 1, 3, 2, 2),
(29, 3, 4, 4, 1, 1),
(30, 1, 3, 5, 1, 1);

CREATE TABLE Articulos_diversos (
    id_articulo SERIAL PRIMARY KEY,
    id_producto INT REFERENCES Productos(id_producto) ON DELETE CASCADE
);
INSERT INTO Articulos_diversos (id_producto) VALUES
(6), (7), (8), (9), (10),  -- Membresías
(11), (12), (13), (14), (15), -- DLC
(16), (17), (18), (19), (20),
(31), (32), (33), (34), (35),
(36), (37), (38), (39), (40);-- Coleccionables



CREATE TABLE Membresia (
    id_membresia SERIAL PRIMARY KEY,
    id_articulo INT REFERENCES Articulos_diversos(id_articulo) ON DELETE CASCADE,
    membresia_nombre VARCHAR(50) NOT NULL
);
INSERT INTO Membresia(id_articulo, membresia_nombre) VALUES
(1, 'Game Pass'),
(2, 'Game Pass Ultimate'),
(3, 'PS Plus+'),
(4, 'Nintendo'),
(5, 'Play Store'),
(16, 'EA Play'),
(17, 'Ubisoft+');

CREATE TABLE Dlc (
    id_dlc SERIAL PRIMARY KEY,
    id_articulo INT REFERENCES Articulos_diversos(id_articulo) ON DELETE CASCADE,
    dlc_nombre VARCHAR(50) NOT NULL
);
INSERT INTO Dlc(id_articulo, dlc_nombre) VALUES
(6, 'Personajes'),
(7, 'Monedas'),
(8, 'Mapa/Nivel'),
(9, 'Season Pass'),
(10, 'Cosmeticos'),
(18, 'Paquete de armas'),
(19, 'Modo historia extra'),
(20, 'Skin legendaria');

CREATE TABLE Coleccionable (
    id_coleccionable SERIAL PRIMARY KEY,
    id_articulo INT REFERENCES Articulos_diversos(id_articulo) ON DELETE CASCADE,
    coleccionable_nombre VARCHAR(50) NOT NULL
);
INSERT INTO Coleccionable(id_articulo, coleccionable_nombre) VALUES
(11, 'Figuras'),
(12, 'Funko Pop'),
(13, 'Cartas'),
(14, 'Hot Toys'),
(15, 'Peluche'),
(21,'Llavero edición especial'),
(22,'Póster de colección'),
(23,'Figura edición limitada'),
(24,'Vinilo musical del juego'),
(25,'Camiseta oficial');

CREATE TABLE Ventas (
    id_venta SERIAL PRIMARY KEY,
    id_producto INT REFERENCES Productos(id_producto) ON DELETE CASCADE,
    cantidad INT NOT NULL
);
INSERT INTO Ventas(id_producto, cantidad) VALUES
(1, 2),
(3, 1),
(5, 1),
(7, 3),
(10, 2);

CREATE TABLE Ticket (
    id_ticket SERIAL PRIMARY KEY,
    id_venta INT REFERENCES Ventas(id_venta) ON DELETE CASCADE,
    fecha_compra DATE NOT NULL
);
INSERT INTO Ticket(id_venta, fecha_compra) VALUES
(1, '2025-06-01'),
(2, '2025-06-02'),
(3, '2025-06-03'),
(4, '2025-06-04'),
(5, '2025-06-05');

CREATE TABLE Reservaciones (
    id_reservacion SERIAL PRIMARY KEY,
    id_ticket INT NOT NULL REFERENCES Ticket(id_ticket) ON DELETE CASCADE,
    fecha_reservacion DATE NOT NULL,
    fecha_entrega DATE NOT NULL
);
INSERT INTO Reservaciones(id_ticket, fecha_reservacion, fecha_entrega) VALUES
(1, '2025-06-10', '2025-06-15'),
(2, '2025-06-11', '2025-06-16'),
(3, '2025-06-12', '2025-06-17'),
(4, '2025-06-13', '2025-06-18'),
(5, '2025-06-14', '2025-06-19');

CREATE TABLE Estado_devolucion (
    id_estado_devolucion SERIAL PRIMARY KEY,
    estado_nombre VARCHAR(50) NOT NULL UNIQUE
);
INSERT INTO Estado_devolucion (estado_nombre) VALUES 
('Procesado'), ('Pendiente'), ('Aceptado'), ('Rechazado'), ('En proceso');

CREATE TABLE Devoluciones (
    id_devolucion SERIAL PRIMARY KEY,
    id_ticket INT NOT NULL REFERENCES Ticket(id_ticket) ON DELETE CASCADE,
    fecha_devolucion DATE NOT NULL,
    id_estado_devolucion INT REFERENCES Estado_devolucion(id_estado_devolucion)
);
INSERT INTO Devoluciones(id_ticket, fecha_devolucion, id_estado_devolucion) VALUES
(1, '2025-06-06', 1),
(2, '2025-06-07', 2),
(3, '2025-06-08', 3),
(4, '2025-06-09', 4),
(5, '2025-06-10', 5);

