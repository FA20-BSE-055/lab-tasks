
package observer_mid;
import java.util.ArrayList;
import java.util.List;
interface Subject {
void attatchObserver(Observer observer);
void detatchObserver(Observer observer);
void notifyObservers();
}
interface Observer {
void update(String match);
}
class LiveMatch implements Subject {
private List<Observer> observers;
private String match;
public LiveMatch() {
observers = new ArrayList<>();
}
@Override
public void attatchObserver(Observer observer) {
observers.add(observer);
}
@Override
public void detatchObserver(Observer observer) {
observers.remove(observer);
}
@Override
public void notifyObservers() {
for (Observer observer : observers) {
observer.update(match);
}
}
public void setMatch(String match) {
this.match = match;
notifyObservers();
}
}
class CityObserver implements Observer {
private String cityName;
public CityObserver(String cityName) {
this.cityName = cityName;
}
@Override
public void update(String match) {
System.out.println("Match update for " + cityName + ": " + match);
}
}
public class Main {
public static void main(String[] args) {
LiveMatch liveMatch = new LiveMatch();
Observer city1 = new CityObserver("City A");
Observer city2 = new CityObserver("City B");
Observer city3 = new CityObserver("City C");
liveMatch.registerObserver(city1);
liveMatch.registerObserver(city2);
liveMatch.registerObserver(city3);
liveMatch.setMatch("Volleyball match live now!");
liveMatch.setMatch("Cricket match in progress!");
liveMatch.setMatch("Football match about to start!");
liveMatch.removeObserver(city3);
liveMatch.setMatch("Another cricket match in progress!");
}
}