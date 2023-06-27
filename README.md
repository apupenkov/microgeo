# MICROGEO
Сервис для получения списка стран

## Создание volume для сохранения данных из БД в docker

docker volume create geo-pgdata

## Запуск БД в docker

docker run --name geo -p 5432:5432 -e POSTGRES_PASSWORD=secret -v geo-pgdata:/var/lib/postgresql/data -d postgres:15.1

## Пример использования

Получение списка всех стран:
  - http://localhost:8081/countries
Получение страны по коду:
  - http://localhost:8081/countries?code=RU
