module ru.example.testmodules{
    exports ru.example.testmodules; // для всех
    exports ru.example.testmodules to ru.example.users.firstuser; // для определенного пакета
}