theBoard = {1: ' ', 2: ' ', 3: ' ', 4: ' ', 5:
' ', 6: ' ', 7: ' ', 8: ' ', 9: ' '}

winCheck = {1: [[2,3],[4,7],[5,9]], 2: [[1,3],[5,8]], 3: [[1,2],[5,7],[6,9]],
            4: [[1,7],[5,6]], 5: [[1,9],[2,8],[3,7],[4,6]], 6: [[4,5],[3,9]],
            7: [[1,4],[3,5],[8,9]], 8: [[2,5],[7,9]], 9: [[1,5],[3,6],[7,8]]}

def printBoard(board):
    print(board[1] + '|' + board[2] + '|' + board[3])
    print('-+-+-')
    print(board[4] + '|' + board[5] + '|' + board[6])
    print('-+-+-')
    print(board[7] + '|' + board[8] + '|' + board[9])

def startGame():
    turn = 'X'
    printBoard(theBoard)
    for i in range(9):
        while True:
            print('Turn for ' + turn + '. Move on which space? Type [1-9]')
            try:
                move = input()
                position = int(move)
                if theBoard[position] == " ":
                    theBoard[position] = turn
                    for j in range(len(winCheck[position])):
                        if turn == theBoard[winCheck[position][j][0]] and \
                           turn == theBoard[winCheck[position][j][1]]:
                                printBoard(theBoard)
                                print(f'The winner is {turn}')
                                return
                    break
                else:
                    print("The spot is occupied.")
                    printBoard(theBoard)
            except (KeyError, ValueError):
                print("Out of Bound")
        printBoard(theBoard)
        if turn == 'X':
            turn = 'O'
        else:
            turn = 'X'
startGame()
