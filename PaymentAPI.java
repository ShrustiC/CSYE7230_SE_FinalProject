public interface PaymentAPI {

	String paymentID = p1;
	DateTime paymentDate = 19000101T00:00:00;
	Double amount = 0.0;

	void createPayment();

	void deletePayment();

	void getPaymentDetail();

	Double getAmount();

	/**
	 * 
	 * @param amount
	 */
	void setAmount(Double amount);

	/**
	 * 
	 * @param paymentID
	 */
	void setPaymentID(String paymentID);

	/**
	 * 
	 * @param paymentDate
	 */
	void setPaymentDate(DateTime paymentDate);

}