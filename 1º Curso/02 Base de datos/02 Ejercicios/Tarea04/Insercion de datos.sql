-- Inserci�n de datos
-- Restaurantes
INSERT INTO Restaurante VALUES (1, 'La Trattoria', 'Calle Principal 123', '555-1234');
INSERT INTO Restaurante VALUES (2, 'Sabor Oriental', 'Avenida Secundaria 456', '555-5678');


-- Clientes
INSERT INTO Cliente VALUES (1, 'Juan P�rez', 'juan@example.com', '555-4321', NULL);
INSERT INTO Cliente VALUES (2, 'Mar�a G�mez', 'maria@example.com', '555-8765', NULL);
INSERT INTO Cliente VALUES (3, 'Ana L�pez', 'ana@example.com', '555-9876', 1); -- Juan P�rez es la referencia de Ana
INSERT INTO Cliente VALUES (4, 'Pedro Ram�rez', 'pedro@example.com', '555-5432', NULL);
INSERT INTO Cliente VALUES (5, 'Laura Torres', 'laura@example.com', '555-6789', NULL);
INSERT INTO Cliente VALUES (6, 'Carlos Garc�a', 'carlos@example.com', '555-8765', 1);
INSERT INTO Cliente VALUES (7, 'Sof�a Mart�nez', NULL, '555-1234', 4);
INSERT INTO Cliente VALUES (8, 'Javier Ruiz', 'javier@example.com', '555-4321', NULL);
INSERT INTO Cliente VALUES (9, 'Isabel Rodr�guez', 'isabel@example.com', NULL, 8);
INSERT INTO Cliente VALUES (10, 'Miguel S�nchez', 'miguel@example.com', '555-1111', NULL);
INSERT INTO Cliente VALUES (11, 'Elena Fern�ndez', 'elena@example.com', '555-2222', 10);
INSERT INTO Cliente VALUES (12, 'Alejandro Vargas', 'alejandro@example.com', '555-3333', 4);


-- Mesas
INSERT INTO Mesa VALUES (1, 4, 'Interior');
INSERT INTO Mesa VALUES (2, 6, 'Terraza');
INSERT INTO Mesa VALUES (3, 8, 'Jard�n');
INSERT INTO Mesa VALUES (4, 4, 'Barra');
INSERT INTO Mesa VALUES (5, 6, 'Terraza VIP');
INSERT INTO Mesa VALUES (6, 2, 'Interior Bar');

-- Pedidos
INSERT INTO Pedido VALUES (1, 1, TO_DATE('2024-01-01', 'YYYY-MM-DD'), 'En Proceso');
INSERT INTO Pedido VALUES (2, 2, TO_DATE('2024-02-01', 'YYYY-MM-DD'), 'Entregado');
INSERT INTO Pedido VALUES (3, 3, TO_DATE('2024-03-02', 'YYYY-MM-DD'), 'Entregado');
INSERT INTO Pedido VALUES (4, 3, TO_DATE('2024-04-02', 'YYYY-MM-DD'), 'En Proceso');
INSERT INTO Pedido VALUES (5, 3, TO_DATE('2024-05-02', 'YYYY-MM-DD'), 'Entregado');
INSERT INTO Pedido VALUES (6, 6, TO_DATE('2024-09-15', 'YYYY-MM-DD'), 'En Proceso');
INSERT INTO Pedido VALUES (7, 8, TO_DATE('2024-10-20', 'YYYY-MM-DD'), 'Entregado');
INSERT INTO Pedido VALUES (8, 9, TO_DATE('2024-11-10', 'YYYY-MM-DD'), 'En Proceso');
INSERT INTO Pedido VALUES (9, 11, TO_DATE('2024-12-05', 'YYYY-MM-DD'), 'Entregado');
INSERT INTO Pedido VALUES (10, 12, TO_DATE('2025-01-03', 'YYYY-MM-DD'), 'En Proceso');


-- Detalle de Pedidos
INSERT INTO DetallePedido VALUES (1, 1, 1, 2);
INSERT INTO DetallePedido VALUES (2, 1, 2, 1);
INSERT INTO DetallePedido VALUES (3, 2, 3, 4);
INSERT INTO DetallePedido VALUES (4, 3, 4, 1);
INSERT INTO DetallePedido VALUES (5, 3, 5, 2);
INSERT INTO DetallePedido VALUES (6, 4, 6, 3);
INSERT INTO DetallePedido VALUES (7, 5, 7, 1);
INSERT INTO DetallePedido VALUES (8, 5, 8, 2);
INSERT INTO DetallePedido VALUES (9, 5, 9, 1);
INSERT INTO DetallePedido VALUES (10, 5, 10, 2);
INSERT INTO DetallePedido VALUES (11, 6, 7, 2);
INSERT INTO DetallePedido VALUES (12, 7, 8, 1);
INSERT INTO DetallePedido VALUES (13, 8, 9, 4);
INSERT INTO DetallePedido VALUES (14, 9, 10, 2);
INSERT INTO DetallePedido VALUES (15, 10, 11, 3);


-- Platos
INSERT INTO Plato VALUES (1, 'Pizza Margherita', 'Italiana', 10.99);
INSERT INTO Plato VALUES (2, 'Sushi Variado', 'Japon�s', 22.50);
INSERT INTO Plato VALUES (3, 'Pollo a la Naranja', 'Chino', 9.99);
INSERT INTO Plato VALUES (4, 'Pasta Carbonara', 'Italiana', 12.99);
INSERT INTO Plato VALUES (5, 'Sashimi de Salm�n', 'Japon�s', 18.50);
INSERT INTO Plato VALUES (6, 'Arroz Tres Delicias', 'Chino', 7.99);
INSERT INTO Plato VALUES (7, 'Filete a la Parrilla', 'Internacional', 24.99);
INSERT INTO Plato VALUES (8, 'Ensalada C�sar', 'Internacional', 9.99);
INSERT INTO Plato VALUES (9, 'Tiramis�', 'Italiana', 8.50);
INSERT INTO Plato VALUES (10, 'Roll Dragon', 'Japon�s', 15.99);

-- Reservas
INSERT INTO Reserva VALUES (1, 1, TO_DATE('2024-03-01', 'YYYY-MM-DD'), 3, 1, 'Mesa cerca de la ventana');
INSERT INTO Reserva VALUES (2, 2, TO_DATE('2024-04-01', 'YYYY-MM-DD'), 5, 2, NULL);
INSERT INTO Reserva VALUES (3, 4, TO_DATE('2024-06-01', 'YYYY-MM-DD'), 2, 3, 'Mesa con sombrilla');
INSERT INTO Reserva VALUES (4, 5, TO_DATE('2024-07-01', 'YYYY-MM-DD'), 4, NULL, 'Preferencia vegetariana');
INSERT INTO Reserva VALUES (5, 6, TO_DATE('2024-08-01', 'YYYY-MM-DD'), 6, 5, 'Celebraci�n de cumplea�os');
INSERT INTO Reserva VALUES (6, 7, TO_DATE('2024-09-01', 'YYYY-MM-DD'), 3, 1, 'Mesa cerca de la ventana');
INSERT INTO Reserva VALUES (7, 8, TO_DATE('2024-10-01', 'YYYY-MM-DD'), 5, 2, 'Sin preferencias');
INSERT INTO Reserva VALUES (8, 9, TO_DATE('2024-11-01', 'YYYY-MM-DD'), 2, NULL, NULL);
INSERT INTO Reserva VALUES (9, 10, TO_DATE('2024-12-01', 'YYYY-MM-DD'), 4, 4, 'Mesa con vista al jard�n');
INSERT INTO Reserva VALUES (10, 11, TO_DATE('2025-01-01', 'YYYY-MM-DD'), 6, 6, 'Celebraci�n de aniversario');