package app.service;

import app.dao.DAOExcepcion;
import app.dao.PedidoDAO;
import app.model.DetallePedido;
import app.model.Pedido;
import java.util.Collection;

public class PedidosNegocio {

    public void realizarPedido(Pedido pedido, Collection<DetallePedido> detalles) throws DAOExcepcion {



        pedido.setDetalles(detalles);

        PedidoDAO dao = new PedidoDAO();
        try {
            dao.insertar(pedido);
        } catch (DAOExcepcion e) {
            throw e;
        }

    }
}
