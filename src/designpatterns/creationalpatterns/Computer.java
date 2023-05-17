package designpatterns.creationalpatterns;

/**
 * @author Raja Choda
 *
 */
public class Computer {
	//required parameters
		private String HDD;
		private String RAM;
		
		//optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		private Computer(ComputerBuilder builder) {
			this.HDD=builder.HDD;
			this.RAM=builder.RAM;
			this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
			this.isBluetoothEnabled=builder.isBluetoothEnabled;
		}
		//Builder Class
		public static class ComputerBuilder{

			// required parameters
			private String HDD;
			private String RAM;

			// optional parameters
			private boolean isGraphicsCardEnabled;
			private boolean isBluetoothEnabled;
			
			public ComputerBuilder(String hdd, String ram){
				this.HDD=hdd;
				this.RAM=ram;
			}

			public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
				this.isGraphicsCardEnabled = isGraphicsCardEnabled;
				return this;
			}

			public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
				this.isBluetoothEnabled = isBluetoothEnabled;
				return this;
			}
			
			public Computer build(){
				return new Computer(this);
			}

		}
		public String getHDD() {
			return HDD;
		}
		public void setHDD(String hDD) {
			HDD = hDD;
		}
		public String getRAM() {
			return RAM;
		}
		public void setRAM(String rAM) {
			RAM = rAM;
		}
		public boolean isGraphicsCardEnabled() {
			return isGraphicsCardEnabled;
		}
		public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		}
		public boolean isBluetoothEnabled() {
			return isBluetoothEnabled;
		}
		public void setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
		}
		@Override
		public String toString() {
			return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
					+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
		}
	
		
}
