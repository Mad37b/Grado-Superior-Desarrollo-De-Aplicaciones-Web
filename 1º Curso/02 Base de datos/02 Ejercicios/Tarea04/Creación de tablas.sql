-- Creación de tablas
CREATE TABLE Restaurante (
    id_restaurante NUMBER PRIMARY KEY,
    nombre VARCHAR2(50) NOT NULL,
    direccion VARCHAR2(100),
    telefono VARCHAR2(15)
);

CREATE TABLE Cliente (
    id_cliente NUMBER PRIMARY KEY,
    nombre VARCHAR2(50) NOT NULL,
    email VARCHAR2(50),
    telefono VARCHAR2(15)
);

-- Referencia reflexiva
ALTER TABLE Cliente ADD id_cliente_referencia NUMBER REFERENCES Cliente(id_cliente);

CREATE TABLE Mesa (
    id_mesa NUMBER PRIMARY KEY,
    capacidad NUMBER,
    ubicacion VARCHAR2(50)
);

CREATE TABLE Pedido (
    id_pedido NUMBER PRIMARY KEY,
    id_cliente NUMBER REFERENCES Cliente(id_cliente),
    fecha_pedido DATE,
    estado VARCHAR2(20)
);

CREATE TABLE DetallePedido (
    id_detalle NUMBER PRIMARY KEY,
    id_pedido NUMBER REFERENCES Pedido(id_pedido),
    id_plato NUMBER,
    cantidad NUMBER
);

CREATE TABLE Plato (
    id_plato NUMBER PRIMARY KEY,
    nombre VARCHAR2(50) NOT NULL,
    tipo VARCHAR2(30),
    precio NUMBER
);


CREATE TABLE Reserva (
    id_reserva NUMBER PRIMARY KEY,
    id_cliente NUMBER REFERENCES Cliente(id_cliente),
    fecha_reserva DATE,
    cantidad_personas NUMBER,
    mesa_preferida NUMBER,
    observaciones VARCHAR2(200)
);