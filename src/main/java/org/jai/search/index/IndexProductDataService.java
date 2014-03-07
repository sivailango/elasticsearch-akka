package org.jai.search.index;

import java.util.List;

import org.jai.search.model.ElasticSearchIndexConfig;
import org.jai.search.model.Product;
import org.jai.search.model.ProductGroup;

public interface IndexProductDataService
{
    void indexAllProducts(ElasticSearchIndexConfig config, List<Product> products);

    void indexProduct(ElasticSearchIndexConfig config, Product product);
    
    boolean isProductExists(ElasticSearchIndexConfig config, Long productId);

    void deleteProduct(ElasticSearchIndexConfig config, Long productId);
}
