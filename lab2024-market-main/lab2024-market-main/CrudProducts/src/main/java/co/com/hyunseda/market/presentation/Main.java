
package co.com.hyunseda.market.presentation;

import co.com.hyunseda.market.access.Factory;
import co.com.hyunseda.market.access.IProductRepository;
import co.com.hyunseda.market.presentation.GUIProducts;
import co.com.hyunseda.market.service.ProductService;

/**
 *
 * @author Libardo Pantoja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IProductRepository ipr = Factory.getInstance().getRepository("default");
        ProductService productService = new ProductService(ipr);
        GUIProducts instance = new GUIProducts(productService);
        instance.setVisible(true);
    }
    
}
