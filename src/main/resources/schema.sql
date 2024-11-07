CREATE SCHEMA IF NOT EXISTS clothes_db;
USE clothes_db;

CREATE TABLE Producto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT,
    talla VARCHAR(10),
    color VARCHAR(50),
    precio DECIMAL(10, 2) NOT NULL,
    stock INT NOT NULL
);

CREATE TABLE Cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    direccion VARCHAR(255)
);

CREATE TABLE Orden (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    total DECIMAL(10, 2) NOT NULL,
    cliente_id BIGINT NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
);

CREATE TABLE Orden_Producto (
    orden_id BIGINT NOT NULL,
    producto_id BIGINT NOT NULL,
    cantidad INT NOT NULL,
    PRIMARY KEY (orden_id, producto_id),
    FOREIGN KEY (orden_id) REFERENCES Orden(id),
    FOREIGN KEY (producto_id) REFERENCES Producto(id)
);

CREATE TABLE Carrito (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cliente_id BIGINT UNIQUE,
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
);

CREATE TABLE Carrito_Producto (
    carrito_id BIGINT NOT NULL,
    producto_id BIGINT NOT NULL,
    cantidad INT NOT NULL,
    PRIMARY KEY (carrito_id, producto_id),
    FOREIGN KEY (carrito_id) REFERENCES Carrito(id),
    FOREIGN KEY (producto_id) REFERENCES Producto(id)
);