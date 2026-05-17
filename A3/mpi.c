#include <stdio.h>
#include <mpi.h>

int main(int argc, char* argv[]) {
    int rank, size;
    int num[20];
    int local_sum = 0, total_sum = 0;

    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Comm_size(MPI_COMM_WORLD, &size);

    // Initialize array (only rank 0 does this logically, but okay for demo)
    for(int i = 0; i < 20; i++) {
        num[i] = i + 1;
    }

    int chunk = 20 / size;
    int start = rank * chunk;
    int end = start + chunk;

    // Each process calculates its local sum
    for(int i = start; i < end; i++) {
        local_sum += num[i];
    }

    printf("Process %d local sum = %d\n", rank, local_sum);

    // Reduce all local sums into total sum at root (rank 0)
    MPI_Reduce(&local_sum, &total_sum, 1, MPI_INT, MPI_SUM, 0, MPI_COMM_WORLD);

    // Root prints final sum
    if(rank == 0) {
        printf("Final Global Sum = %d\n", total_sum);
    }

    MPI_Finalize();
    return 0;
}