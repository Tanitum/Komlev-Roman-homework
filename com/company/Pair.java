/**
 *  класс Pair может содержать 2 объекта, может содержать значения, равные null.
 * @author Комлев Роман
 * @version 1.1
 */
package com.company;

import java.util.Objects;

public class Pair<T, S> {
    /** Первое поле */
    private T first;
    /** Второе поле */
    private S second;
    /** Приватный конструктор - создание нового pair */
    private Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    /** Функция получения значения первого поля
     * @return значение первого поля*/
    public T getFirst() {
        return first;
    }
    /** Функция получения значения второго поля
     * @return значение первого поля*/
    public S getSecond() {
        return second;
    }
    /** Статический фабричный метод (по сути статичный метод, возвращающий новый объект,
     *  то есть вызывающий приватный конструктор с параметрами метода внутри себя)  */
    public static <T,S> Pair <T,S> of(T first, S second) {
        return new Pair<>(first,second);
    }
    /** Хэш-код */
    @Override
    public int hashCode() { //хэш-код
        int a = getFirst() == null ? 0 : getFirst().hashCode();
        int b = getSecond() == null ? 0 : getSecond().hashCode();
        return a + b;
    }
    /** Метод equals сравнивает две пары элементов
     * @param pair - Пара элементов разных типов
     * @deprecated - Если еще будут версии, то неплохо бы переписать equals. Сейчас метод может неправильно работать при некоторых входных null
     * @return true или false */
    public boolean equals(Pair <T, S> pair) {
        if ((pair instanceof Pair) ) {
            if (this.first==null) {
                if (pair.getFirst()==null) {
                    if (this.second==null) {
                        if (pair.getSecond()==null){
                             return true;
                         }else {return false;}
                    }else {return Objects.equals(this.second, pair.getSecond());}
                }else {return false;}
            }else if (this.first!=null && pair.getFirst()!=null && this.second!=null && pair.getSecond()!=null){
                return Objects.equals(this.first, pair.getFirst()) && Objects.equals(this.second, pair.getSecond());
            }
            else {
                return false;
            }
        } else {
            return false;
        }
    }
    /**  Метод toString приводит оба поля класса pair к строке, происходит добавление скобок и пробелов */
    @Override
    public String toString() {
        if (first==null && first==null){
            return "(null, null)";
        }
        else if (first==null && first!=null){
            return "(null, "+ second.toString() + ")";
        }
        else if (first!=null && first==null){
            return "(" + first.toString() + ", null)";
        }
        else{
        return "(" + first.toString() + ", " + second.toString() + ")";}
    }
    }
