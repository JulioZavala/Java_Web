package app.DAO;

import app.dao.DAOExcepcion;
import app.dao.ProductoDAO;
import junit.framework.Assert;
import org.junit.Test;

public class ProductoDAOTest {

    @Test
    public void obtenerTotalTest() {
        ProductoDAO dao = new ProductoDAO();
        try {
            int total = dao.obtenerTotal();
            System.out.println("Total --> " + total);

            Assert.assertTrue(total > 0);
        } catch (DAOExcepcion e) {
            Assert.fail("falló");
        }
    }
}
