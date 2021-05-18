package polito.it.noleggio.model;

import java.time.LocalTime;
public class Event implements Comparable<Event>{
	//enumerazione che potrei definire in una classe separata, è come definire un oggetto che può avere solo quei due attributi che risultano essere costanti
	public enum EventType{
		NUOVO_CLIENTE,
		RITORNO_AUTO
	}
	//a quale istante di tempo si riferisce l'evento
	private LocalTime time;
	private EventType type;
	
	public Event(LocalTime time, EventType type) {
		this.time = time;
		this.type = type;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + "]";
	}

	@Override
	public int compareTo(Event o) {
		return this.time.compareTo(o.time);
	}
	
	
	
}
