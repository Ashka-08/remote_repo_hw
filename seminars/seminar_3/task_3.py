class ZeroDivisionErr(Exception):
    def init(self):
        super().init('Деление на ноль запрещено')

    
try:
    d = 5 /0
except ZeroDivisionError:
    raise ZeroDivisionErr


# class ArrayError(Exception):
#     def init(self, index):
#         super().init(f'Несуществующий индекс: {index}')

    
# try:
#     arr = [1,2,3]
#     print(arr[4])
# except IndexError:
#     raise ArrayError(4)



# class FileError(Exception):
#     def init(self, index):
#         super().init(f'Несуществующий файл: {index}')

    
# try:
#     link = 'qwerty'
#     file = open(link, mode = 'r')
# except FileNotFoundError:
#     raise FileError(link)