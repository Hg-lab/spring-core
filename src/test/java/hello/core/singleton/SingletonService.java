package hello.core.singleton;

import org.junit.jupiter.api.Test;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static final SingletonService getInstance() {
        return instance;
    }

    // 외부에서 new 키워드로 객체 인스턴스가 생성되는 것을 막는다
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
