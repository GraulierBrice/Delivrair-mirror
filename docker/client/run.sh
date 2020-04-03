#!/bin/bash

# the image will be removed when stopped
docker run --rm -it -v $(pwd):/host isadevopsn/dd-client

# ^C to stop
