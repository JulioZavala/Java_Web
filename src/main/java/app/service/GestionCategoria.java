
package app.service;

import app.dao.CategoriaDAO;
import app.dao.DAOExcepcion;
import app.model.Categoria;
import java.util.Collection;


public class GestionCategoria {
    
    
       
    public static void main(String[] args) throws DAOExcepcion {
        
        
        // Categoria catOficina = GestionCategoria.insertar("oficina", "prodcutos de oficina");
        // Categoria catCasa = GestionCategoria.insertar("casa", "prodcutos de casa");
        //GestionCategoria.listar();
        
    }
    
    
    
    
    
    public Collection<Categoria> buscarPorNombre(String nombre)
			throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();
		return dao.listar();
	}

	public static Categoria insertar(String nombre, String descripcion)
			throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();

		Categoria vo = new Categoria();
		vo.setNombre(nombre);
		vo.setDescripcion(descripcion);

		return dao.insertar(vo);
	}

	public Categoria obtener(int idCategoria) throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();
		return dao.obtener(idCategoria);
	}

	public void eliminar(int idCategoria) throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();
		dao.eliminar(idCategoria);
	}

	public Categoria actualizar(int idCategoria, String nombre,
			String descripcion) throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();

		Categoria vo = new Categoria();
		vo.setId(idCategoria);
		vo.setNombre(nombre);
		vo.setDescripcion(descripcion);

		return dao.actualizar(vo);
	}

	public static void listar() throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();
		Collection<Categoria> categorias = dao.listar();
                
                
                for (Categoria categoria : categorias) {
                    System.out.println(categoria.getId()+" "+categoria.getNombre());
            }
                
                
                //return dao.listar();
	}

    
}
