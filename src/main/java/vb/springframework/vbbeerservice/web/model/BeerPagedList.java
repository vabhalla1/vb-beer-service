package vb.springframework.vbbeerservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by SAP_ALL  on 1/19/2020  10:34 AM
 */
public class BeerPagedList extends PageImpl<BeerDto> {
    public BeerPagedList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<BeerDto> content) {
        super(content);
    }
}
