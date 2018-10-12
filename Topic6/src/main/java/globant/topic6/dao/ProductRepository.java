package globant.topic6.dao;

import globant.topic6.model.Product;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
/**
 *
 * @author Emiliano
 */
public class ProductRepository /* extends JpaRepository<Product, Long> */ {
    
    static final String PERSISTENCE_UNIT_NAME = "Product";
    EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    
    EntityManager em = factory.createEntityManager();
    
    public void getProducts() {
    Query q = em.createNativeQuery("SELECT * FROM Product p");
    List<Product[]> products = q.getResultList();
 
    for (Product[] p : products) {
    System.out.println("Product id:  "
            + p[0]
            + ", name: "
            + p[1]
            + ", price: "
            + p[2]
            + ", quantity: "
            + p[3]);
    }
    }
    
    public void addProduct() {
    Query q = em.createNativeQuery();
    }
    /**
     * @return
     */
 /*    @Override    
    @Query("select * from Product p")
    List<Product> findAll();

    @Query("select * from Product p where p.product_id = ?1")
    Product getProductById(Long id);
    
    @Query("insert into Product values (?1, ?2, ?3, ?4)")
    Product addProduct(Long id, String name, double price, int quantity);
    
    @Query("update Product set product_name = ?2, price = ?3, quantity = ?4 where product_id = ?1")
    Product updateProductById(Long id, String name, double price, int quantity);
*/
}
