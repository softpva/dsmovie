import axios from "axios";
import MovieCard from "components/MovieCard";
// import MovieScore from "components/MovieScore";
import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { MoviePage } from "types/movie";
import { BASE_URL } from "utils/requests";

function Listing() {

    // // FORMA ERRADA SÓ PARA TESTE:
    // // axios.get is a promisse an async operation
    // // when operation return the 'then' commad run the function inside it
    // axios.get(`${BASE_URL}/movies?size=12&page=1`)
    //         .then(response => {
    //             console.log(response.data);
    //         } ); 
    // // when we use logic as above, the React can send request many times
    // // then we must use react-hooks to build the logic that respects the life cicle of react

    // The correct form using react-hooks:
    const [pageNumber, setPageNumber] = useState(0);
    const [page, setPage] = useState<MoviePage>(
        {
            content: [],
            last: true,
            totalPages: 0,
            totalElements: 0,
            size: 12,
            number: 0,
            first: true,
            numberOfElements: 0,
            empty: true,
        }
    );

    useEffect(() => {
        axios.get(`${BASE_URL}/movies?size=12&page=${pageNumber}&sort=id`)
            .then(response => {
                const data = response.data as MoviePage;
                // console.log(data);
                // setPageNumber(data.number);
                setPage(data);
            });
    }, [pageNumber])

    const handlePageChange = (newPageNumber : number) => {
        setPageNumber(newPageNumber);
    }

    return (
        <>
            <Pagination page={page} onChange= {handlePageChange} />
            {/* Using Bootstrap's breakpoints and classes container, row, col 
                col-sm-6 represents, by example, if sm < 576px the container will ocupy 6 
                of 12 Boostrap's total columns
                mb-3 : margin botton = 3*/
            }
            <div className="container">
                <div className="row">
                    {page.content.map(movie => (
                        <div key={movie.id} className="col-sm-6 col-lg-4 col-xl-3 mb-5">
                            <MovieCard movie={movie}/>
                        </div>
                    ))}
                </div>
            </div>
        </>
    )
}

export default Listing;