package th.co.geniustree.springdata.jpa.specification;

import th.co.geniustree.springdata.jpa.domain.Document;
import th.co.geniustree.springdata.jpa.domain.Document_;
import org.springframework.data.jpa.domain.Specification;

/**
 * Created by pramoth on 9/29/2016 AD.
 */
public class DocumentSpecs {
    public static Specification<Document> idEq(Long id){
        return (root, query, cb) -> cb.equal(root.get(Document_.id),id);
    }
}
