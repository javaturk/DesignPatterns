
class Basbakan:

    def dert_dinle(self) -> None:
        pass

    def is_bul(self) -> None:
        pass

class GercekBasbakan(Basbakan):

    def dert_dinle(self) -> None:
        print("Basbakan: Dinliyorum.")

    def is_bul(self) -> None:
        print("Basbakan: Bana boyle isteklerle gelmeyin.")

class VekilBasbakan(Basbakan):

    def __init__(self, real_subject: GercekBasbakan) -> None:
        self.gercek_basbakan = gercek_basbakan

    def dert_dinle(self) -> None:
        print("Vekil: Derdinizi dinliyorum.")
        self.gercek_basbakan.dert_dinle()

    def is_bul(self) -> None:
        print("Vekil: İsteğinizi dinliyorum.")
        #self.gercek_basbakan.is_bul()

print("*** Vatandaş başbakanlık kalemine gelir ve süreç başlar. ***")
gercek_basbakan = GercekBasbakan()
vekil_Basbakan = VekilBasbakan(gercek_basbakan)

vekil_Basbakan.dert_dinle()
vekil_Basbakan.is_bul()

