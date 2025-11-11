package secao18.aula197.util;

import java.util.function.Consumer;

import secao18.aula197.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
