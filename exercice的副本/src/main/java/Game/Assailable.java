package Game;

public interface Assailable {
String getName();
int getX();
void setX(int x);
int getY();
void setY(int y);
int getHp();
void setHp(int hp);
boolean canFightByDistance(Assailable ass);
void fight (Assailable ass);
}
