### Single Responsibility Principle
- Contact отвечает только за хранение информации о контакте
### Open-Closed Principle
- DataService - хранит инфо о методах добавлени контактов и чтения телефонной книги
### Liskov Substitution Principle
- workContact - наследуется от класса родителя Contact 
### Interface Segregation Principle
- SearchContact - производит поиск по контактам.
### Dependency Inversion Principle
- ChangeFormat - должен выводить информацию в различных форматах (doc, pdf, txt)
