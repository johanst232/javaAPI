INSERT INTO producto (nombre, descripcion, talla, color, precio, stock)
VALUES
    ('Camiseta Basica', 'Camiseta de algodon 100%', 'M', 'Negro', 15.00, 50),
    ('Jeans Slim Fit', 'Jeans ajustados de corte clasico', 'L', 'Azul', 40.00, 30);


INSERT INTO cliente (nombre, email, direccion)
VALUES
    ('Juan Perez', 'juan.perez@example.com', 'Calle Falsa 123'),
    ('Ana Gomez', 'ana.gomez@example.com', 'Avenida Real 456');

INSERT INTO orden (total, cliente_id)
VALUES
    (55.00, 1);

INSERT INTO orden_Producto (orden_id, producto_id, cantidad)
VALUES
    (1, 1, 1), -- Camiseta
    (1, 2, 1); -- Jeans

INSERT INTO carrito (cliente_id)
VALUES
    (2);

INSERT INTO carrito_Producto (carrito_id, producto_id, cantidad)
VALUES
    (1, 1, 2); -- Camiseta en el carrito del cliente con id 2
