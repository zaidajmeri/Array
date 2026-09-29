package Java_Projects;

//Point_of_Sale_Billing_Terminal
public class Invoice {
	int invoiceId;
	double[] itemPrices;
	int itemCount;
	double itemTaxRate[];

	// Primary Constructor
	Invoice(int invoiceId, int maxCapacity) {
		this.invoiceId = invoiceId;
		this.itemPrices = new double[maxCapacity];
		this.itemTaxRate = new double[maxCapacity];
		itemCount = 0;
	}

	Invoice(int invoiceId) {
		this(invoiceId, 10);
	}

	boolean addItem(double price, double taxRate) {
		if (price > 0 && taxRate >= 0 && itemCount < itemPrices.length) {
			itemPrices[itemCount] = price;
			itemTaxRate[itemCount] = taxRate;
			itemCount++;
			return true;
		} else {
			System.out.println("Cannot add item: Invoice is full or price is invalid (" + price + ")");
			return false;
		}
	}

	double getSubtotal() {
		double sum = 0.0;
		for (int i = 0; i < itemCount; i++) {
			sum += itemPrices[i];
		}
		return sum;
	}

	double getTotalTax() {
		double totalTax = 0.0;
		for (int i = 0; i < itemCount; i++) {
			totalTax += itemPrices[i] * (itemTaxRate[i] / 100.0);
		}
		return totalTax;
	}

	double getGrandTotal() {
		return getSubtotal() + getTotalTax();
	}

	void printReciept() {
		System.out.println("==============================");
		System.out.println("Invoice # " + invoiceId);
		System.out.println("------------------------------");

		for (int i = 0; i < itemCount; i++) {
			double itemTax = itemPrices[i] * (itemTaxRate[i] / 100.0);
			System.out.println("# " + (i + 1) + ""
					+ "\t₹" + itemPrices[i] + "\t" + itemTaxRate[i] + "%\t₹" + itemTax);
		}

		System.out.println("------------------------------");
		System.out.println("Total Item: ₹" + itemCount);
		System.out.println("SubTotal: ₹" + getSubtotal());
		System.out.println("Total Tax: ₹" + getTotalTax());
		System.out.println("Grand Total: ₹" + getGrandTotal());
		System.out.println("==============================");
	}

	public static void main(String[] args) {
		Invoice i1 = new Invoice(101, 10);
		i1.addItem(65, 0);
		i1.addItem(599, 18);
		i1.addItem(1099, 9);
		i1.addItem(799, 18);
		i1.addItem(199, 18);
		i1.addItem(365, 5);
		i1.addItem(99, 8);
		i1.addItem(1499, 18);
		i1.addItem(199, 18);
		i1.addItem(50, 2);
		
		i1.printReciept();
	}
}
