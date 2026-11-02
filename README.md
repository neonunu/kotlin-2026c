# Kotlin 2026C

2026년 2학기 모바일 프로그래밍 수업에서 작성한 Kotlin·Android 실습 저장소입니다. 각 폴더는 독립적으로 실행할 수 있는 Android Studio 프로젝트이며, 주차별로 학습한 기능을 누적해 정리합니다.

## 프로젝트 구성

| 폴더 | 학습 내용 |
| --- | --- |
| `KotlinBasics` | Kotlin과 Android 프로젝트의 기본 구조 |
| `AppWeek05` | 단일 화면 UI와 기본 이벤트 처리 |
| `AppWeek06` | 여러 `Activity`, 카운터·인사·색상 변경 기능 |
| [`AppWeek07`](./AppWeek07/) | `ListView`, `ArrayAdapter`, 데이터 클래스, 모드 전환, Git 브랜치 실습 |

## 실행 방법

각 주차 앱은 별도의 Gradle 프로젝트입니다.

1. Android Studio에서 실행할 폴더를 엽니다. 예: `AppWeek07`
2. Gradle Sync가 끝날 때까지 기다립니다.
3. Android Emulator 또는 Android 8.1(API 27) 이상의 기기를 선택합니다.
4. `app` 실행 구성을 실행합니다.

터미널에서 Week 07 단위 테스트를 실행하려면 다음 명령을 사용합니다.

```bash
cd AppWeek07
./gradlew test
```

## 브랜치 학습 흐름

Week 07은 기능별 브랜치를 나누어 개발하고 통합하는 과정을 연습합니다.

- `main`: 수업의 기준 코드
- `week07/shopping-cart`: 학생 목록에 장바구니 기능을 추가한 단계
- 이후 단계: Task Manager 기능 개발 및 통합

브랜치에 따라 보이는 기능이 다를 수 있습니다. 현재 체크아웃한 브랜치와 각 프로젝트의 README를 먼저 확인하세요.

## 저장소 관리 원칙

- 소스 코드와 Gradle Wrapper는 버전 관리합니다.
- `local.properties`, `.idea/`, `.gradle/`, `build/` 등 로컬·생성 파일은 커밋하지 않습니다.
- 기능 단위로 브랜치를 만들고, 동작 확인 후 통합합니다.
- 수업용 예제이므로 데이터는 앱 실행 중 메모리에만 저장되며 앱을 다시 실행하면 초기화될 수 있습니다.
