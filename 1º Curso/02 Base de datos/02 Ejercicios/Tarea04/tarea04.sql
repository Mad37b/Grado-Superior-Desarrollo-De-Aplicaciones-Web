SELECT SUM(detallepedido.cantidad) AS total_pedidos,plato.tipo  FROM detallePedido, plato GROUP BY tipo;
