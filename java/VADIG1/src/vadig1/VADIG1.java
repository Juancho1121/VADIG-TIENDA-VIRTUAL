/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vadig1;

import java.sql.*;

public class VADIG1 {

    public static void main(String[] args) {
        String usuario = "root";
        String password = "Juanchozs1121.";
        String url = "jdbc:mysql://localhost:3306/vadigaccesorios";
        Connection conexion = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
           
            conexion = DriverManager.getConnection(url, usuario, password);
            statement = conexion.createStatement();

          
            statement.executeUpdate("INSERT INTO Clientes (Nombre, Apellido, Email, Telefono, Direccion) VALUES ('Juan', 'Pérez', 'juan@example.com', '123456789', 'Calle Principal 123')");
            System.out.println("Cliente insertado correctamente.");

          
            rs = statement.executeQuery("SELECT * FROM Clientes");
            while (rs.next()) {
                System.out.println("ID Cliente: " + rs.getInt("IDCliente"));
                System.out.println("Nombre: " + rs.getString("Nombre"));
                System.out.println("Apellido: " + rs.getString("Apellido"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("Telefono: " + rs.getString("Telefono"));
                System.out.println("Direccion: " + rs.getString("Direccion"));
                System.out.println("---------------------------------");
            }

          
            statement.executeUpdate("INSERT INTO Productos (Nombre, Descripcion, Precio, Stock) VALUES ('Producto1', 'Descripción del producto 1', 10.99, 100)");
            System.out.println("Producto insertado correctamente.");

       
            rs = statement.executeQuery("SELECT * FROM Productos");
            while (rs.next()) {
                System.out.println("ID Producto: " + rs.getInt("IDProducto"));
                System.out.println("Nombre: " + rs.getString("Nombre"));
                System.out.println("Descripción: " + rs.getString("Descripcion"));
                System.out.println("Precio: " + rs.getDouble("Precio"));
                System.out.println("Stock: " + rs.getInt("Stock"));
                System.out.println("---------------------------------");
            }

          
            statement.executeUpdate("INSERT INTO carrito (EstadoPedido, IDCliente) VALUES ('Pendiente', 1)");
            System.out.println("Pedido insertado correctamente.");

          
            rs = statement.executeQuery("SELECT * FROM carrito");
            while (rs.next()) {
                System.out.println("ID Pedido: " + rs.getInt("IDPedido"));
                System.out.println("Fecha Pedido: " + rs.getTimestamp("FechaPedido"));
                System.out.println("Estado Pedido: " + rs.getString("EstadoPedido"));
                System.out.println("ID Cliente: " + rs.getInt("IDCliente"));
                System.out.println("---------------------------------");
            }

          
            statement.executeUpdate("INSERT INTO DetallesPedido (IDPedido, IDProducto, Cantidad, PrecioUnitario) VALUES (1, 1, 2, 20.99)");
            System.out.println("Detalle de pedido insertado correctamente.");

          
            rs = statement.executeQuery("SELECT * FROM DetallesPedido");
            while (rs.next()) {
                System.out.println("ID Pedido: " + rs.getInt("IDPedido"));
                System.out.println("ID Producto: " + rs.getInt("IDProducto"));
                System.out.println("Cantidad: " + rs.getInt("Cantidad"));
                System.out.println("Precio Unitario: " + rs.getDouble("PrecioUnitario"));
                System.out.println("---------------------------------");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
           
            try {
                if (rs != null) rs.close();
                if (statement != null) statement.close();
                if (conexion != null) conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
