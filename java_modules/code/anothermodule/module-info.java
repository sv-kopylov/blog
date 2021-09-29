module ru.example.users{ // ru.example.users это название модуля, совпадает с началом пакета
	exports ru.example.users.firstuser; // пакет, который торчит наружу из модуля, их м.б. несколько
	requires ru.example.testmodules; // пакет, от которого зависит модуль, их м.б. несколько
}