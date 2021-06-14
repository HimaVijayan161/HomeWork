public class Car
{
	
    private boolean engine;
    
    private boolean gear;
    
    private boolean clutch;
    
    private boolean brake;
    
    private boolean steering;
    
    private boolean suspension;
    
 /*   private boolean doors;
    
    private boolean mirrors;
    
    private boolean wiper;
    
    private boolean headLight;
    
    private boolean tailLight;*/
    

	public boolean isEngineWorking() {
		return engine;
	}

	public void setEngine(boolean engine) {
		this.engine = engine;
	}

	public boolean isGearWorking() {
		return gear;
	}

	public void setGear(boolean gear) {
		this.gear = gear;
	}

	public boolean isClutchWorking() {
		return clutch;
	}

	public void setClutch(boolean clutch) {
		this.clutch = clutch;
	}

	public boolean isBrakeWorking() {
		return brake;
	}

	public void setBrake(boolean brake) {
		this.brake = brake;
	}

	public boolean isSteeringWorking() {
		return steering;
	}

	public void setSteering(boolean steering) {
		this.steering = steering;
	}

	public boolean isSuspensionWorking() {
		return suspension;
	}

	public void setSuspension(boolean suspension) {
		this.suspension = suspension;
	}
    
}