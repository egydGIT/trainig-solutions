/*
Activity interface: Két metódusa van a getDistance() amivel az adott sport közben megtett távot tudjuk lekérdezni,
valamint a getType(), amivel a tevékenységünk típusát kaphatjuk meg.
 */

package project04;

public interface Activity {

    double getDistance();

    ActivityType getType();

}
