
class InsufficientBalanceException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

		public InsufficientBalanceException(String str)
		{
			super(str);
		}
	}
	class IllegalBankTransactionException extends RuntimeException{
		private static final long serialVersionUID = 1L;

		public IllegalBankTransactionException(String str)
		{
			super(str);
		}
	}