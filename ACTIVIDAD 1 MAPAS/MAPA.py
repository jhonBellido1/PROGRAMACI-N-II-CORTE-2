class Usuario:
    def __init__(self, nombre_completo, nickname, clave, tipo, fecha_creacion):
        self.nombre_completo = nombre_completo
        self.nickname = nickname
        self.clave = clave
        self.tipo = tipo
        self.fecha_creacion = fecha_creacion

    def datos(self):
        return {
            'nombre_completo': self.nombre_completo,
            'nickname': self.nickname,
            'clave': self.clave,
            'tipo': self.tipo,
            'fecha_creacion': self.fecha_creacion
        }


MAPA = {}

def agregar_usuario():
    nombre_completo = input("Ingrese el nombre completo: ")
    nickname = input("Ingrese el nickname: ")
    clave = input("Ingrese la clave: ")
    tipo = input("Ingrese el tipo de usuario: ")
    fecha_creacion = input("Ingrese la fecha de creación (DD/MM/AAAA): ")

    usuario = Usuario(nombre_completo, nickname, clave, tipo, fecha_creacion)
    MAPA[nickname] = usuario.datos()
    print(f"Usuario '{nickname}' agregado exitosamente.")

def buscar_usuario(nickname):
    return MAPA.get(nickname, None)

def eliminar_usuario(nickname):
    if nickname in MAPA:
        del MAPA[nickname]
        print(f"Usuario '{nickname}' eliminado exitosamente.")
    else:
        print(f"Usuario '{nickname}' no encontrado.")

def menu():
    while True:
        print("\n    Menú    ")
        print("1. Agregar Usuario")
        print("2. Buscar Usuario")
        print("3. Eliminar Usuario")
        print("4. Salir")
        
        opcion = input("Seleccione una opción: ")

        if opcion == '1':
            agregar_usuario()
        elif opcion == '2':
            nickname = input("Ingrese el nickname del usuario a buscar: ")
            usuario = buscar_usuario(nickname)
            if usuario:
                print("Usuario encontrado:", usuario)
            else:
                print("Usuario no encontrado.")
        elif opcion == '3':
            nickname = input("Ingrese el nickname del usuario a eliminar: ")
            eliminar_usuario(nickname)
        elif opcion == '4':
            print("Saliendo del programa.")
            break
        else:
            print("Opción no válida. Por favor, intente de nuevo.")


if __name__ == "__main__":
    menu()
    

