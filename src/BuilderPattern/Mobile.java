package BuilderPattern;

public class Mobile {

	private String os;
	private String osVersion;
	private String ram;
	private String processor;
	private String camera;
	private String battery;
	
	private Mobile(MobileBuilder builder) {
		super();
		this.os = builder.os;
		this.osVersion = builder.osVersion;
		this.ram = builder.ram;
		this.processor = builder.processor;
		this.camera = builder.camera;
		this.battery = builder.battery;
	}

	@Override
	public String toString() {
		return "Mobile [os=" + os + ", osVersion=" + osVersion + ", ram=" + ram + ", processor=" + processor
				+ ", camera=" + camera + ", battery=" + battery + "]";
	}

	static class MobileBuilder {
		
		private String os;
		private String osVersion;
		private String ram;
		private String processor;
		private String camera;
		private String battery;
		
		public MobileBuilder os(String os) {
			this.os = os;
			return this;
		}
		
		public MobileBuilder osVersion(String osVersion) {
			this.osVersion = osVersion;
			return this;
		}
		public MobileBuilder ram(String ram) {
			this.ram = ram;
			return this;
		}
		public MobileBuilder processor(String processor) {
			this.processor = processor;
			return this;
		}
		public MobileBuilder camera(String camera) {
			this.camera = camera;
			return this;
		}
		public MobileBuilder battery(String battery) {
			this.battery = battery;
			return this;
		}
		
		public Mobile build() {
			return new Mobile(this);
		}
	}
}
