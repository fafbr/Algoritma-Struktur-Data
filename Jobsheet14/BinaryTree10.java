public class BinaryTree10 {
    Node10 root;

    public BinaryTree10() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa10 mahasiswa) {
        Node10 newNode = new Node10(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node10 current = root;
            Node10 parrent = null;
            while (true) {
                parrent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parrent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parrent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node10 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node10 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node10 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node10 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node10 getSuccessor(Node10 del) {
        Node10 successor = del.right;
        Node10 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node10 parent = root;
        Node10 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node10 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public void addRekursif(Mahasiswa10 mahasiswa) {
        root = addRekursifHelper(root, mahasiswa);
    }

    private Node10 addRekursifHelper(Node10 current, Mahasiswa10 mahasiswa) {
        if (current == null) {
            return new Node10(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursifHelper(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursifHelper(current.right, mahasiswa);
        }
        return current;
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong.");
            return;
        }

        Node10 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.print("Mahaiswa dengan IPK terkecil: ");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong.");
            return;
        }
        Node10 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.print("Mahaiswa dengan IPK terbesar: ");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("\nMahasiswa dengan IPK di atas " + ipkBatas + ": ");
        tampilMahasiswaIPKdiAtasHelper(root, ipkBatas);        
    }

    private void tampilMahasiswaIPKdiAtasHelper(Node10 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtasHelper(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtasHelper(node.right, ipkBatas);
        }
    }
}
